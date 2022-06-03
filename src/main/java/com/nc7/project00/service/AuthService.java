package com.nc7.project00.service;

import com.nc7.project00.dto.AuthDTO;

public interface AuthService {
    /**
     * 用户登录认证
     *
     * @param params 账号和密码
     * @return {0=成功;1=账号或密码不能为空;2=用户不存在或密码错误}
     */
    int loginAuth(AuthDTO params);
}
