package com.yinuo.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
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
}
