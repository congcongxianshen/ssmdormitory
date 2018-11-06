package com.kj.base.controller;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kj.base.entity.ClassEntity;
import com.kj.base.service.ClassService;
import com.kj.base.utils.Page;
import com.kj.base.utils.ResultVO;


@Controller
@RequestMapping("classController")
public class ClassController {
	private static final Logger logger = Logger.getLogger(ClassController.class);
	
	@Autowired
	private ClassService classService;
	
	/**
	 * 按照条件 分页查询 班级信息
	 * @param page
	 * @param size
	 * @param className
	 * @param teacherName
	 * @return
	 */
	@ResponseBody
	@RequestMapping("list") // url: classController/list?page  
	public ResultVO getAllClass(@RequestParam(required=false,defaultValue="1") Integer page
									,@RequestParam(required=false,defaultValue="3")Integer size
									,@RequestParam(required=false,defaultValue="")String className
									,@RequestParam(required=false,defaultValue="")String teacherName
								){ 
		ResultVO result = new ResultVO();
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("page", page);
		map.put("size", size);
		map.put("className", className);
		map.put("teacherName", teacherName);
		Page<ClassEntity> allClass = null;
		try {
			allClass = classService.getAllClass(map);
			if(allClass != null){
				result.setCode(200);
				result.setMsg("查询成功");
				result.setData(allClass);
			}
		} catch (Exception e) {
			result.setCode(500);
			result.setMsg("查询失败");
			e.printStackTrace();
		}
		logger.info("logger:------>"+result);
		return result;
	}

	/**
	 * 新增一个班级信息
	 */
	
	@ResponseBody
	@RequestMapping("add")
	public ResultVO insertClassInfo(ClassEntity classInfo){
		ResultVO result = new ResultVO();
		Integer number = 0;
		try {
			number = classService.insetClass(classInfo);
			if(1 == number){ 
				result.setCode(200);
				result.setMsg("插入成功");
				result.setData(number);
			}
		} catch (Exception e) {
			result.setCode(500);
			result.setMsg("插入失败");
			e.printStackTrace();
		}
		
		return result;
	}
	
	/**
	 * 更新一个班级信息
	 */
	
	@ResponseBody
	@RequestMapping("update")
	public ResultVO updateClassInfo(ClassEntity classInfo){
		ResultVO result = new ResultVO();
		Integer number = 0;
		try {
			number = classService.updateClass(classInfo);
			if(1 == number){ 
				result.setCode(200);
				result.setMsg("更新成功");
				result.setData(number);
			}
		} catch (Exception e) {
			result.setCode(500);
			result.setMsg("更新失败");
			e.printStackTrace();
		}
		return result;
	}
	/**
	 * 删除一个班级信息
	 */
	
	@ResponseBody
	@RequestMapping("delete")
	public ResultVO deleteClassInfo(String id){
		ResultVO result = new ResultVO();
		Integer number = 0;
		try {
			number = classService.deleteClass(id);
			if(1 == number){ 
				result.setCode(200);
				result.setMsg("删除成功");
				result.setData(number);
			}
		} catch (Exception e) {
			result.setCode(500);
			result.setMsg("删除失败");
			e.printStackTrace();
		}
		return result;
	}
}
