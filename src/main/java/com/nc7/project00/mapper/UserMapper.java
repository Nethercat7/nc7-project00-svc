package com.nc7.project00.mapper;

import com.nc7.project00.entity.User;
import com.nc7.project00.vo.UserVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    /**
     * 批量添加用户
     *
     * @param params User数组
     * @return 成功插入数据库的数量
     */
    int branchAdd(@Param("params") List<User> params);

    /**
     * 通过ID查询用户
     * @param id 用户ID
     * @return UserVo
     */
    UserVO getUserById(@Param("id") String id);

    /**
     * 通过用户名|电子邮箱|手机号码查询用户
     * @param credential 用户名|电子邮箱|手机号码
     * @return UserVo
     */
    UserVO getUserByCredential(@Param("credential") String credential);
}
