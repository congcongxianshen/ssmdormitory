package com.kj.base.mapper;

import com.kj.base.entity.DamageEntity;

public interface DamageEntityMapper {
	int deleteByPrimaryKey(String id);

    int insert(DamageEntity record);

    int insertSelective(DamageEntity record);

    DamageEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(DamageEntity record);

    int updateByPrimaryKey(DamageEntity record);
}