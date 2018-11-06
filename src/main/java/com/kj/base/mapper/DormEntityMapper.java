package com.kj.base.mapper;

import com.kj.base.entity.DormEntity;

public interface DormEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(DormEntity record);

    int insertSelective(DormEntity record);

    DormEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(DormEntity record);

    int updateByPrimaryKey(DormEntity record);
}