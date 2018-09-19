package com.tang.users.mapper;

import com.tang.users.model.Users;

import java.util.List;
import java.util.Map;

public interface UsersMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(Users record);

    int insertSelective(Users record);

    /**
     * 获取符合条件的用户集合
     * @param requestMap
     * @return
     */
    List<Users> getAll(Map<String , Object> requestMap);

    Users selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);
}