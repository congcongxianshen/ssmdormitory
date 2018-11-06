package com.kj.base.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kj.base.entity.StudentEntity;
import com.kj.base.mapper.ClassEntityMapper;
import com.kj.base.mapper.StudentEntityMapper;
import com.kj.base.service.StudentService;
import com.kj.base.utils.Page;
import com.kj.base.utils.UUid;


@Service
public class StudentServiceImpl implements StudentService {
	private static final Logger logger = Logger.getLogger(StudentServiceImpl.class);
	@Autowired
	private StudentEntityMapper studentMapper;
	@Autowired
	private ClassEntityMapper classMapper;
	
	public Integer insertStudent(StudentEntity student) {
		student.setId(UUid.getUUID());
		student.setCreatetime(new Date());
		Integer number = studentMapper.insert(student);
		return number;
	}

	public Integer updateStudent(StudentEntity student) {
		Integer number = studentMapper.updateByPrimaryKeySelective(student);
		return number;
	}

	public Integer deleteStudent(String id) {
		Integer number = studentMapper.deleteByPrimaryKey(id);
		return number;
	}

	public Page<Map<String, Object>> selectAllStudent(Integer page, Integer size, StudentEntity student,String dormName) {
		Map<String, Object> map = new HashMap<String,Object>();
		// 查询总记录数
		Integer total = studentMapper.selectCounts();
		//计算总页数
		Integer pages = 1;
		//计算当前起始行
		Integer start = 0;
		if(total % size == 0){
			pages = total / size;
		}
		if(total % size != 0){
			if(total>size){
				pages = (total/size)+1;
			}
			if(total<size){
				pages = 1;
			}
		}
		start = (page-1) * size;
		map.put("start", start);
		map.put("size", size);
		map.put("student", student);
		map.put("dormName", dormName);
		//@  第一种写法
		//List<StudentVO> rows = studentMapper.selectByCondition(map);
		
		List<Map<String, Object>> rows = studentMapper.selectByCondition(map);
		
		logger.info("rows============"+rows);
		return new Page<Map<String, Object>>(total, pages, size, rows);
	}
}
