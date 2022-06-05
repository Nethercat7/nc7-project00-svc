package com.nc7.project00.service.impl;

import com.nc7.project00.entity.Tag;
import com.nc7.project00.mapper.TagMapper;
import com.nc7.project00.service.TagService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.UUID;

@Service
public class TagServiceImpl implements TagService {
    @Resource
    private TagMapper tagMapper;

    @Override
    public int add(Tag params) {
        params.setId(String.valueOf(UUID.randomUUID()));
        return tagMapper.add(params);
    }
}
