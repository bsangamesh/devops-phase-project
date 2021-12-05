package com.restdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.restdemo.bean.HelloWorldBean;

@RestController
public class RestDemoController {

	@RequestMapping(method = RequestMethod.GET, path = "/")
	public String helloWorld() {
		return "Hello World";
	}

	@GetMapping(path = "/hello")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World Bean");
	}

	@GetMapping(path = "/hello/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello %s", name));
	}

}
