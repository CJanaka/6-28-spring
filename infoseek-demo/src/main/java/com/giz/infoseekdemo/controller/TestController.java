package com.giz.infoseekdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/hello")
public class TestController {

	@GetMapping()
	public static String hello() {
		return "Hello..!";
	}
	
	@GetMapping("/{name}")
	public String getName(@PathVariable(value = "name") String name) {
		return "My name is "+name;
	}
}
