package com.kj.base.mapper;

import com.kj.base.entity.VisitorEntity;

public interface VisitorEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(VisitorEntity record);

    int insertSelective(VisitorEntity record);

    VisitorEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(VisitorEntity record);

    int updateByPrimaryKey(VisitorEntity record);
}