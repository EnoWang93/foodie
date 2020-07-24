package com.yinuo.service.impl;

import com.yinuo.common.DateUtils;
import com.yinuo.common.MD5Utils;
import com.yinuo.common.enums.Sex;
import com.yinuo.mapper.UsersMapper;
import com.yinuo.pojo.Users;
import com.yinuo.pojo.bo.UserBO;
import com.yinuo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.Date;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    public UsersMapper usersMapper;

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public boolean doesUserExist(String username) {

        Example userExample = new Example(Users.class);
        Example.Criteria userCriteria = userExample.createCriteria();

        userCriteria.andEqualTo("username", username);

        Users result = usersMapper.selectOneByExample(userExample);

        return result != null;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public Users createUser(UserBO userBO) {

        Users user = new Users();
        user.setId(DateUtils.generateId());
        user.setUsername(userBO.getUserName());
        try {
            user.setPassword(MD5Utils.getMD5Str(userBO.getPassword()));
        } catch (Exception e) {
            e.printStackTrace();
        }

        user.setNickName(userBO.getUserName());
        user.setAvadar("");
        user.setBirthday(DateUtils.stringToDate("1900-01-01"));
        user.setSex(Sex.unknown.type);

        user.setCreatedTime(new Date());
        user.setUpdatedTime(new Date());

        usersMapper.insert(user);

        return user;
    }
}

