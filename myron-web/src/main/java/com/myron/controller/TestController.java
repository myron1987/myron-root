package com.myron.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

	public TestController() {

		System.out.println("TestController constructed......");

	}

	@RequestMapping("test")
	public ModelAndView testMVC() {

		ModelAndView modelAndView = new ModelAndView("test");

		modelAndView.addObject("info", 10000);

		return modelAndView;

	}
	
	@RequestMapping("testM")
	@ResponseBody
	public Map<String,String> testMap(){
		Map<String,String> test = new HashMap<String, String>();
		test.put("a", "1");
		test.put("ae", "1");
		test.put("ar", "1");
		test.put("as", "1");
		test.put("af", "1");
		test.put("aa", "1");
		return test;
	}
	
	@RequestMapping("test/{name}")
	@ResponseBody
	public String testRest(@PathVariable String name){
		
		return "Hello " + name;
	}
}
