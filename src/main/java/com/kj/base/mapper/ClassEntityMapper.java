package com.kj.base.mapper;

import java.util.List;
import java.util.Map;

import com.kj.base.entity.ClassEntity;

public interface ClassEntityMapper {
	/**删除一条  班级信息  根据id*/
    int deleteByPrimaryKey(String id);

    /**插入一条  班级信息 */
    int insert(ClassEntity record);

    /**插入一条  班级信息  */
    int insertSelective(ClassEntity record);

    /**查询一条  班级信息  根据id*/
    ClassEntity selectByPrimaryKey(String id);

    /**更新一条  班级信息  根据id 有变动的就更新，没变动的不动*/
    int updateByPrimaryKeySelective(ClassEntity record);
    
    /**更新一条  班级信息 */
    int updateByPrimaryKey(ClassEntity record);
    
    /**查询  班级信息 根据过滤条件和分页信息*/
    List<ClassEntity> selectAllClassInfo(Map map);
    
    /**查询总共的记录数*/
    Integer selectAllCount();
}