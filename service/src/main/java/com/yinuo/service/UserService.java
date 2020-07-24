package com.yinuo.service;

import com.yinuo.pojo.User;
import com.yinuo.pojo.bo.UserBO;

public interface UserService {
    boolean doesUserExist(String username);
    User createUser(UserBO userBO);
    User findUserByUsernameAndPassword(String username, String password);
}
