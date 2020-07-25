package com.yinuo.controller;

import com.yinuo.common.RestReturnJson;
import com.yinuo.pojo.bo.ShoppingCartBO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("shopcart")
public class ShoppingCartController {

    @PostMapping("/add")
    public RestReturnJson add(
            @RequestParam String userId,
            @RequestBody ShoppingCartBO shopcartBO,
            HttpServletRequest request,
            HttpServletResponse response
    ) {

        if (StringUtils.isBlank(userId)) {
            return RestReturnJson.errorMsg("");
        }

        return RestReturnJson.ok();
    }

    @PostMapping("/del")
    public RestReturnJson del(
            @RequestParam String userId,
            @RequestParam String itemSpecId,
            HttpServletRequest request,
            HttpServletResponse response
    ) {

        if (StringUtils.isBlank(userId) || StringUtils.isBlank(itemSpecId)) {
            return RestReturnJson.errorMsg("null request");
        }

        return RestReturnJson.ok();
    }

}
