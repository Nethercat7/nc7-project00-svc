package com.nc7.project00.controller;

import com.nc7.project00.entity.User;
import com.nc7.project00.service.UserService;
import com.nc7.project00.utils.WebResponse;
import com.nc7.project00.vo.UserVO;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Resource
    private UserService userService;

    @PostMapping("")
    public WebResponse addUser(@RequestBody List<User> params) {
        int status = userService.branchAdd(params);
        if (status > 0) {
            return new WebResponse(200, status, "成功添加" + status + "个用户");
        } else {
            return new WebResponse(500, status, "添加用户失败");
        }
    }

    @GetMapping("/{id}")
    public WebResponse getUserById(@PathVariable("id") String id) {
        UserVO user = userService.getUserById(id);
        if (!ObjectUtils.isEmpty(user)) {
            return new WebResponse(200, user);
        } else {
            return new WebResponse(500, user);
        }
    }
}
