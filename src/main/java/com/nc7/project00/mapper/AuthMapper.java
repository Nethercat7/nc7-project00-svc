package com.nc7.project00.mapper;

import com.nc7.project00.vo.AuthVo;
import org.springframework.web.bind.annotation.RequestParam;

public interface AuthMapper {
    /**
     * 获取用户认证信息
     *
     * @param credential 用户名|电子邮箱|手机号码
     * @return AuthVo
     */
    AuthVo getUserAuthInfo(@RequestParam("credential") String credential);
}
