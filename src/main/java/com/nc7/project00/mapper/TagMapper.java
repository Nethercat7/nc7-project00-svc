package com.nc7.project00.mapper;

import com.nc7.project00.entity.Tag;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TagMapper {
    /**
     * 添加标签
     *
     * @param params Tag
     * @return int
     */
    int add(@Param("params") Tag params);
}
