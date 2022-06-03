package com.nc7.project00.service;

import com.nc7.project00.entity.User;
import com.nc7.project00.vo.UserVo;

import java.util.List;

public interface UserService {
    /**
     * 批量添加用户
     *
     * @param params User数组
     * @return 成功插入数据库的数量
     */
    int branchAdd(List<User> params);

    /**
     * 通过ID查询用户
     *
     * @param id 用户ID
     * @return UserVo
     */
    UserVo getUserById(String id);
}
