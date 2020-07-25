package com.yinuo.controller;

import com.yinuo.common.MobileEmailUtils;
import com.yinuo.common.RestReturnJson;
import com.yinuo.pojo.UserAddress;
import com.yinuo.pojo.bo.AddressBO;
import com.yinuo.service.AddressService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("address")
@RestController
public class AddressController {


    @Autowired
    private AddressService addressService;

    @PostMapping("/list")
    public RestReturnJson list(
            @RequestParam String userId) {

        if (StringUtils.isBlank(userId)) {
            return RestReturnJson.errorMsg("");
        }

        List<UserAddress> list = addressService.queryAll(userId);
        return RestReturnJson.ok(list);
    }

    @PostMapping("/add")
    public RestReturnJson add(@RequestBody AddressBO addressBO) {

        RestReturnJson checkRes = checkAddress(addressBO);
        if (checkRes.getStatus() != 200) {
            return checkRes;
        }

        addressService.addNewUserAddress(addressBO);

        return RestReturnJson.ok();
    }

    private RestReturnJson checkAddress(AddressBO addressBO) {
        String receiver = addressBO.getRecipient();
        if (StringUtils.isBlank(receiver)) {
            return RestReturnJson.errorMsg("empty name");
        }
        if (receiver.length() > 12) {
            return RestReturnJson.errorMsg("long name");
        }

        String mobile = addressBO.getMobile();
        if (StringUtils.isBlank(mobile)) {
            return RestReturnJson.errorMsg("empty phone");
        }
        if (mobile.length() != 11) {
            return RestReturnJson.errorMsg("11 digit of phone number");
        }
        boolean isMobileOk = MobileEmailUtils.checkMobileIsOk(mobile);
        if (!isMobileOk) {
            return RestReturnJson.errorMsg("");
        }

        String province = addressBO.getState();
        String city = addressBO.getCity();
        String district = addressBO.getDistrict();
        String detail = addressBO.getDetail();
        if (StringUtils.isBlank(province) ||
                StringUtils.isBlank(city) ||
                StringUtils.isBlank(district) ||
                StringUtils.isBlank(detail)) {
            return RestReturnJson.errorMsg("address null");
        }

        return RestReturnJson.ok();
    }
}
