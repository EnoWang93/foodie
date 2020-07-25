package com.yinuo.service;

import com.yinuo.pojo.UserAddress;
import com.yinuo.pojo.bo.AddressBO;

import java.util.List;

public interface AddressService {


    public List<UserAddress> queryAll(String userId);

    public void addNewUserAddress(AddressBO addressBO);
//
//    public void updateUserAddress(AddressBO addressBO);
//
//    public void deleteUserAddress(String userId, String addressId);
//
//    public void updateUserAddressToBeDefault(String userId, String addressId);
//
//    public UserAddress queryUserAddress(String userId, String addressId);
}
