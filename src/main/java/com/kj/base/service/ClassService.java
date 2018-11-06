package com.kj.base.service;
import java.util.Map;

import com.kj.base.entity.ClassEntity;
import com.kj.base.utils.Page;
public interface ClassService {
	
	/**按照条件分页查新 班级信息*/
	Page<ClassEntity> getAllClass(Map<String, Object> page);
	
	/**插入一条 班级信息*/
	Integer insetClass(ClassEntity classInfo);
	
	/**更新一条 班级信息*/
	Integer updateClass(ClassEntity classInfo);
	
	/**删除一条 班级信息 根据班级id*/
	Integer deleteClass(String id);
	
	/**批量删除 班级信息 根据班级ids*/
	Integer deleteBatchClass(String[] ids);

}
