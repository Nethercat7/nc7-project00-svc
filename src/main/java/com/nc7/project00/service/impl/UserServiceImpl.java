package com.nc7.project00.service.impl;

import com.nc7.project00.entity.User;
import com.nc7.project00.mapper.UserMapper;
import com.nc7.project00.service.UserService;
import com.nc7.project00.vo.UserVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public int branchAdd(List<User> params) {
        for (User user:params
             ) {
            user.setId(String.valueOf(UUID.randomUUID()));
        }
        return userMapper.branchAdd(params);
    }

    @Override
    public UserVO getUserById(String id) {
        return userMapper.getUserById(id);
    }

    @Override
    public UserVO getUserByCredential(String credential) {
        return userMapper.getUserByCredential(credential);
    }
}
