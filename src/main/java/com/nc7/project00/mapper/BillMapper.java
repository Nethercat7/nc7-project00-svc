package com.nc7.project00.mapper;

import com.nc7.project00.entity.Bill;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BillMapper {
    /**
     * 添加账单
     *
     * @param params Bill
     * @return int
     */
    int add(@Param("params") Bill params);
}
