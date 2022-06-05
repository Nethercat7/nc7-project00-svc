package com.nc7.project00.service.impl;

import com.nc7.project00.entity.Bill;
import com.nc7.project00.mapper.BillMapper;
import com.nc7.project00.service.BillService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.UUID;

@Service
public class BillServiceImpl implements BillService {
    @Resource
    private BillMapper billMapper;

    @Override
    public int add(Bill params) {
        params.setId(UUID.randomUUID().toString());
        return billMapper.add(params);
    }
}
