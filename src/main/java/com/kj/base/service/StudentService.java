package com.kj.base.service;

import java.util.Map;

import com.kj.base.entity.StudentEntity;
import com.kj.base.utils.Page;


public interface StudentService {

	/**插入一个学生信息*/
	Integer insertStudent(StudentEntity student);

	/**更新一个学生信息*/
	Integer updateStudent(StudentEntity student);

	/**删除一个学生信息*/
	Integer deleteStudent(String id);

	/**查询学生信息  根据过滤条件和分页信息*/
	Page<Map<String, Object>> selectAllStudent(Integer page, Integer size, StudentEntity student,String dormInfo);

}
