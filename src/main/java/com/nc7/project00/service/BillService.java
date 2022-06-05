package com.nc7.project00.service;

import com.nc7.project00.entity.Bill;

public interface BillService {
    /**
     * 添加账单
     *
     * @param params Bill
     * @return int
     */
    int add(Bill params);
}
