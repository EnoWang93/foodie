package com.yinuo.controller;

import com.yinuo.common.RestReturnJson;
import com.yinuo.pojo.User;
import com.yinuo.pojo.bo.UserBO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.yinuo.service.UserService;

@RestController
@RequestMapping("passport")
public class PassportController {

    @Autowired
    private UserService userService;

    @GetMapping("/userExisted")
    public int userExisted(@RequestParam String username) {
        if (StringUtils.isBlank(username)) {
            return 500;
        }
        if (userService.doesUserExist(username)) {
            return 500;
        }
        return 200;
    }

    @PostMapping("/signup")
    public RestReturnJson createUser(@RequestBody UserBO userBO) {
        String username = userBO.getUsername();
        String password = userBO.getPassword();
        String confirmPwd = userBO.getConfirmPassword();

        // 0. NOT NULL
        if (StringUtils.isBlank(username) ||
                StringUtils.isBlank(password) ||
                StringUtils.isBlank(confirmPwd)) {
            return RestReturnJson.errorMsg("username or password can't be empty");
        }

        // 1. user exists
        boolean isExist = userService.doesUserExist(username);
        if (isExist) {
            return RestReturnJson.errorMsg("User already exists");
        }

        // 2. length of password
        if (password.length() < 6) {
            return RestReturnJson.errorMsg("length of password");
        }

        // 3. password same
        if (!password.equals(confirmPwd)) {
            return RestReturnJson.errorMsg("inconsistent password");
        }

        // 4. sign up
        User userResult = userService.createUser(userBO);

        return RestReturnJson.ok();
    }
}
