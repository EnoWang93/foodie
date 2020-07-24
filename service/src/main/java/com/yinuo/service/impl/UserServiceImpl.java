package com.yinuo.service.impl;

import com.yinuo.common.DateUtils;
import com.yinuo.common.MD5Utils;
import com.yinuo.common.enums.Sex;
import com.yinuo.mapper.UserMapper;
import com.yinuo.pojo.User;
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
    public UserMapper userMapper;

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public boolean doesUserExist(String username) {

        Example userExample = new Example(User.class);
        Example.Criteria userCriteria = userExample.createCriteria();

        userCriteria.andEqualTo("username", username);

        User result = userMapper.selectOneByExample(userExample);

        return result != null;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public User createUser(UserBO userBO) {

        User user = new User();
        user.setId(DateUtils.generateId());
        user.setUsername(userBO.getUsername());
        try {
            user.setPassword(MD5Utils.getMD5Str(userBO.getPassword()));
        } catch (Exception e) {
            e.printStackTrace();
        }

        user.setNickName(userBO.getUsername());
        user.setAvadar("");
        user.setBirthday(DateUtils.stringToDate("1900-01-01"));
        user.setSex(Sex.unknown.type);

        user.setCreatedTime(new Date());
        user.setUpdatedTime(new Date());
        userMapper.insert(user);
        return user;
    }


    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public User findUserByUsernameAndPassword(String username, String password) {

        Example userExample = new Example(User.class);
        Example.Criteria userCriteria = userExample.createCriteria();

        userCriteria.andEqualTo("username", username);
        userCriteria.andEqualTo("password", password);

        User user = userMapper.selectOneByExample(userExample);

        return user;
    }
}

