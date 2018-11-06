package com.kj.base.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kj.base.entity.ClassEntity;
import com.kj.base.mapper.ClassEntityMapper;
import com.kj.base.service.ClassService;
import com.kj.base.utils.Page;
import com.kj.base.utils.UUid;

@Service
public class ClassServiceImpl implements ClassService {

	@Autowired
	private ClassEntityMapper classMapper;
	
	public Page<ClassEntity> getAllClass(Map<String, Object> map) {
		Integer size = (Integer) map.get("size");
		Integer page = (Integer) map.get("page");
		
		//查询总记录数
		Integer counts = classMapper.selectAllCount();
		Integer pages = 1;
		Integer start = 0;
		
		//计算查询的起始行
		start = (page-1)*size;
		
		//计算总页数
		if(counts%size==0){
			pages=counts/size;
		}
		if(counts%size!=0){
			if(counts>size){
				pages=(counts/size)+1;
			}
			if(counts<size){
				pages=1;
			}
		}
		map.put("start",start);
		List<ClassEntity> rows = classMapper.selectAllClassInfo(map);
		Page<ClassEntity> pageInfo = new Page<ClassEntity>(counts, pages, size, rows);
		return pageInfo;
	}

	public Integer insetClass(ClassEntity classInfo) {
		classInfo.setId(UUid.getUUID());
		classInfo.setCreatetime(new Date());
		return classMapper.insert(classInfo);
		
	}

	public Integer updateClass(ClassEntity classInfo) {
		return classMapper.updateByPrimaryKeySelective(classInfo);
	}

	public Integer deleteClass(String id) {
		return classMapper.deleteByPrimaryKey(id);
	}

	public Integer deleteBatchClass(String[] ids) {
		
		return null;
	}

}
