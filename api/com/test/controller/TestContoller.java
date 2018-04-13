package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.dtr.ResponseData;
import com.test.services.TestService;

@Controller
@RequestMapping("/test")
public class TestContoller {

	@Autowired
	private TestService testService;

	@RequestMapping("/init")
	public ResponseData test() {
		ResponseData data = new ResponseData();
		data.setData(testService.getTime());
		return data;
	}
	
}
