package com.kj.base.mapper;

import java.util.List;
import java.util.Map;

import com.kj.base.entity.StudentEntity;

public interface StudentEntityMapper {
	/**删除一个学生信息 根据id*/
    int deleteByPrimaryKey(String id);

    /**插入一个学生信息*/
    int insert(StudentEntity record);

    /**插入一个学生信息 */
    int insertSelective(StudentEntity record);

    /**查找一个学生信息 根据id*/
    StudentEntity selectByPrimaryKey(String id);

    /**更新一个学生信息 */
    int updateByPrimaryKeySelective(StudentEntity record);

    /**更新一个学生信息 根据id*/
    int updateByPrimaryKey(StudentEntity record);

    //List<StudentVO> selectByCondition(Map<String, Object> map);
    /**查询学生信息 根据过滤条件和分页信息*/
    List<Map<String, Object>> selectByCondition(Map<String, Object> map);
    
    /**查询学生的总数*/
	Integer selectCounts();
}