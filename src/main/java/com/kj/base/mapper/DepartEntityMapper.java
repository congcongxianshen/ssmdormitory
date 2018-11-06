package com.kj.base.mapper;

import com.kj.base.entity.DepartEntity;

public interface DepartEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(DepartEntity record);

    int insertSelective(DepartEntity record);

    DepartEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(DepartEntity record);

    int updateByPrimaryKey(DepartEntity record);
}