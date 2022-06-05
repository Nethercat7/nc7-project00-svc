package com.nc7.project00.service;

import com.nc7.project00.entity.Bill;
import com.nc7.project00.vo.BillVO;

import java.util.List;

public interface BillService {
    /**
     * 添加账单
     *
     * @param params Bill
     * @return int
     */
    int add(Bill params);

    /**
     * 获取账单信息
     *
     * @param username 用户名
     * @param range    week|month|year
     * @param type     0=支出;1=收入
     * @return List
     */
    List<BillVO> getBillStats(String username, String range, String type);
}
