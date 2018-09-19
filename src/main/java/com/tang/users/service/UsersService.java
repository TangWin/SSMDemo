package com.tang.users.service;

import com.tang.users.model.Users;

import java.util.List;
import java.util.Map;

public interface UsersService {

    /**
     * 获取符合条件的用户
     * @param requestMap
     * @return
     * @throws Exception
     */
    List<Users> getUsersAll(Map<String , Object> requestMap) throws Exception;

    /**
     * 根据id获取用户
     * @param requestMap
     * @return
     * @throws Exception
     */
    Users getUsersByUserId(Map<String , Object> requestMap) throws Exception;

}
