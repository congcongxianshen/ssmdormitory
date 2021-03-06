package com.kj.base.mapper;

import com.kj.base.entity.ResourceEntity;

public interface ResourceEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(ResourceEntity record);

    int insertSelective(ResourceEntity record);

    ResourceEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ResourceEntity record);

    int updateByPrimaryKey(ResourceEntity record);
}