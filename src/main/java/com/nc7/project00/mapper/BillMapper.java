package com.nc7.project00.mapper;

import com.nc7.project00.entity.Bill;
import com.nc7.project00.vo.BillVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BillMapper {
    /**
     * 添加账单
     *
     * @param params Bill
     * @return int
     */
    int add(@Param("params") Bill params);

    /**
     * 获取账单信息
     *
     * @param username 用户名
     * @param range    week|month|year
     * @param type     0=支出;1=收入
     * @return List
     */
    List<BillVO> getBillStats(@Param("username") String username, @Param("range") String range, @Param("type") String type);
}
