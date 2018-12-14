package sample.aop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sample.aop.service.HelloWorldService;


@RestController
public class TestController {

	@Autowired
	private HelloWorldService helloWorldService;
	
	@RequestMapping(value = "/hello")
	public String getHello() {
		System.out.println(helloWorldService.getHelloMessage());
		
		return "Hello World restController";
	}	
	
}