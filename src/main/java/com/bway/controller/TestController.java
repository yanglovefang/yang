package com.bway.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/** 
 * @author 百慕古杜 
 * @version 创建时间：2018年5月22日 下午3:37:28 
 * 类说明 ：
 */

@RequestMapping("/test")
@Controller
public class TestController {
	
	@Value("${student.name}")
	private String studentName;
	
	@Value("${student.school}")
	private String studentSchool;
	
	@Value("${student.class}")
	private String studentClass;
	
	@RequestMapping("")
	public String test(ModelMap map){
		System.out.println(studentName);
		System.out.println(studentSchool);
		System.out.println(studentClass);
		
		map.put("studentName", studentName);
		map.put("studentSchool", studentSchool);
		map.put("studentClass", studentClass);
		
		return "index";
		
	}
	
	
	@RequestMapping("/test1")
	public String test1(ModelMap map){
//		System.out.println(studentName);
//		System.out.println(studentSchool);
//		System.out.println(studentClass);
		
		map.put("studentName", studentName);
		map.put("studentSchool", studentSchool);
		map.put("studentClass", studentClass);
		
		return "index1";
		
	}
	
	

}
