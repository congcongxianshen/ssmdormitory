package com.kj.base.mapper;

import com.kj.base.entity.ScoreEntity;

public interface ScoreEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(ScoreEntity record);

    int insertSelective(ScoreEntity record);

    ScoreEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ScoreEntity record);

    int updateByPrimaryKey(ScoreEntity record);
}