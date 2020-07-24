package com.yinuo.controller;

import com.yinuo.common.CookieUtils;
import com.yinuo.common.JsonUtils;
import com.yinuo.common.MD5Utils;
import com.yinuo.common.RestReturnJson;
import com.yinuo.pojo.User;
import com.yinuo.pojo.bo.UserBO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.yinuo.service.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
    public RestReturnJson createUser(@RequestBody UserBO userBO,
                                     HttpServletRequest request,
                                     HttpServletResponse response) {
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

        userResult = setNullProperty(userResult);

        CookieUtils.setCookie(request, response, "user",
                JsonUtils.objectToJson(userResult), true);

        return RestReturnJson.ok();
    }

    @PostMapping("/signin")
    public RestReturnJson signin(@RequestBody UserBO userBO,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {

        String username = userBO.getUsername();
        String password = userBO.getPassword();

        if (StringUtils.isBlank(username) ||
                StringUtils.isBlank(password)) {
            return RestReturnJson.errorMsg("username or password can't be empty");
        }

        User userResult = userService.findUserByUsernameAndPassword(username,
                MD5Utils.getMD5Str(password));

        if (userResult == null) {
            return RestReturnJson.errorMsg("incorrect username or password");
        }
        CookieUtils.setCookie(request, response, "user",
                JsonUtils.objectToJson(userResult), true);

        return RestReturnJson.ok(userResult);
    }

    private User setNullProperty(User userResult) {
        userResult.setPassword(null);
        userResult.setMobile(null);
        userResult.setEmail(null);
        userResult.setCreatedTime(null);
        userResult.setUpdatedTime(null);
        userResult.setBirthday(null);
        return userResult;
    }
}
