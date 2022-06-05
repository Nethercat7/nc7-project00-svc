package com.nc7.project00.service.impl;

import com.nc7.project00.dto.AuthDTO;
import com.nc7.project00.mapper.AuthMapper;
import com.nc7.project00.service.AuthService;
import com.nc7.project00.vo.AuthVO;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;

@Service
public class AuthServiceImpl implements AuthService {
    @Resource
    private AuthMapper authMapper;

    @Override
    public int loginAuth(AuthDTO params) {
        if (ObjectUtils.isEmpty(params.getCredential())||ObjectUtils.isEmpty(params.getPassword())) {
            return 1;
        }
        AuthVO loginInfo = authMapper.getUserAuthInfo(params.getCredential());
        if (!ObjectUtils.isEmpty(loginInfo) && loginInfo.getPassword().equals(params.getPassword())) {
            return 0;
        } else {
            return 2;
        }
    }
}
