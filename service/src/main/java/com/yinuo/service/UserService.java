package com.yinuo.service;

import com.yinuo.pojo.Users;
import com.yinuo.pojo.bo.UserBO;

public interface UserService {
    boolean doesUserExist(String username);
    Users createUser(UserBO userBO);
}
