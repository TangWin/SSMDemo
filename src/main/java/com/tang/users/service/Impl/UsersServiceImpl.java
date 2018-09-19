package com.tang.users.service.Impl;

import com.tang.users.mapper.UsersMapper;
import com.tang.users.model.Users;
import com.tang.users.service.UsersService;
import com.tang.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author TW
 */
@Service("usersService")
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersMapper usersMapper;

    @Override
    public List<Users> getUsersAll(Map<String , Object> requestMap) throws Exception {
        return usersMapper.getAll(requestMap) ;

    }
    @Override
    public Users getUsersByUserId(Map<String , Object> requestMap) throws Exception {
        if (StringUtil.isEmpty(requestMap.get("userId"))) {
            throw new Exception("请传入userId");
        }
        return usersMapper.selectByPrimaryKey(Integer.valueOf(requestMap.get("userId").toString()));

    }


}
