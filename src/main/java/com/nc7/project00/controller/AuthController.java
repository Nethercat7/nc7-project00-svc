package com.nc7.project00.controller;

import com.nc7.project00.dto.AuthDTO;
import com.nc7.project00.service.AuthService;
import com.nc7.project00.service.UserService;
import com.nc7.project00.utils.WebResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @Resource
    private AuthService authService;

    @Resource
    private UserService userService;

    @PostMapping("/login")
    public WebResponse login(@RequestBody AuthDTO params) {
        int status = authService.loginAuth(params);
        if (status == 1) {
            return new WebResponse(500, "账号或密码不能为空");
        } else if (status == 2) {
            return new WebResponse(500, "用户不存在或密码错误");
        }
        return new WebResponse(200, userService.getUserByCredential(params.getCredential()), "登录成功");
    }
}
