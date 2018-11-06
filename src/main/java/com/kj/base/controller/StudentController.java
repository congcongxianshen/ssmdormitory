package com.kj.base.controller;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kj.base.entity.StudentEntity;
import com.kj.base.service.StudentService;
import com.kj.base.utils.Page;
import com.kj.base.utils.ResultVO;



@Controller
@RequestMapping("studentController")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	/**
	 * 新增一个学生
	 * @param student
	 * @return
	 */
	@ResponseBody
	@RequestMapping("add")
	public ResultVO inserStudent(StudentEntity student){
		ResultVO resultVO = new ResultVO();
		student.setCreatetime(new Date());
		Integer number = 0;
		try {
			number = studentService.insertStudent(student);
			if(1 == number){
				resultVO.setCode(200);
				resultVO.setMsg("插入成功");
				resultVO.setData(number);
			}else{
				resultVO.setCode(500);
				resultVO.setMsg("插入错误");
				resultVO.setData(number);
			}
		} catch (Exception e) {
			resultVO.setCode(500);
			resultVO.setMsg("插入错误");
			resultVO.setData(number);
			e.printStackTrace();
		}
		return resultVO;
	}
	
	/**
	 * 更新一个学生信息
	 * @param student
	 * @return
	 */
	@ResponseBody
	@RequestMapping("update")
	public ResultVO updateStudent(StudentEntity student){
		ResultVO resultVO = new ResultVO();
		Integer number = 0;
		try {
			number = studentService.updateStudent(student);
			if(1 == number){
				resultVO.setCode(200);
				resultVO.setMsg("更新成功");
				resultVO.setData(number);
			}else{
				resultVO.setCode(500);
				resultVO.setMsg("更新错误");
				resultVO.setData(number);
			}
		} catch (Exception e) {
			resultVO.setCode(500);
			resultVO.setMsg("更新错误");
			resultVO.setData(number);
			e.printStackTrace();
		}
		return resultVO;
	}
	
	/**
	 * 删除一个学生
	 */
	@ResponseBody
	@RequestMapping("delete")
	public ResultVO deleteStudent(String id){
		ResultVO resultVO = new ResultVO();
		Integer number = 0;
		try {
			number = studentService.deleteStudent(id);
			if(1 == number){
				resultVO.setCode(200);
				resultVO.setMsg("删除成功");
				resultVO.setData(number);
			}else{
				resultVO.setCode(500);
				resultVO.setMsg("删除错误");
				resultVO.setData(number);
			}
		} catch (Exception e) {
			resultVO.setCode(500);
			resultVO.setMsg("删除错误");
			resultVO.setData(number);
			e.printStackTrace();
		}
		return resultVO;
	}

	/**
	 * 按照条件查询
	 */
	@ResponseBody
	@RequestMapping("list")
	public ResultVO selectAllStudent( @RequestParam(required=false,defaultValue="1") Integer page,
									@RequestParam(required=false,defaultValue="3") Integer size,
									@RequestParam(required=false,defaultValue="") String name,
									@RequestParam(required=false,defaultValue="") String mobile,
									@RequestParam(required=false,defaultValue="") String qq,
									@RequestParam(required=false,defaultValue="") String dormInfo ){
		ResultVO resultVO = new ResultVO();
		StudentEntity student = new StudentEntity();
		student.setName(name);
		student.setMobile(mobile);
		student.setQq(qq);
		
		Page<Map<String, Object>> list = studentService.selectAllStudent(page,size,student,dormInfo);
		
		resultVO.setCode(200);
		resultVO.setMsg("查询成功");
		resultVO.setData(list);
		
		return resultVO;
	}
	
	// TODO  退宿功能
}
