package com.nc7.project00.service.impl;

import com.nc7.project00.entity.Bill;
import com.nc7.project00.mapper.BillMapper;
import com.nc7.project00.service.BillService;
import com.nc7.project00.vo.BillVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
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

    @Override
    public List<BillVO> getBillStats(String username, String range, String type) {
        return billMapper.getBillStats(username, range, type);
    }
}
