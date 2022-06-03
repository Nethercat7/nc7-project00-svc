package com.nc7.project00.mapper;

import com.nc7.project00.entity.User;
import com.nc7.project00.vo.UserVo;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Repository
public interface UserMapper {
    /**
     * 批量添加用户
     *
     * @param params User数组
     * @return 成功插入数据库的数量
     */
    int branchAdd(@RequestParam("params") List<User> params);

    /**
     * 通过ID查询用户
     * @param id 用户ID
     * @return UserVo
     */
    UserVo getUserById(@RequestParam("id") String id);
}
