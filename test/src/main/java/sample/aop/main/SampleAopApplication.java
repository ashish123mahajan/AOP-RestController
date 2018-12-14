package sample.aop.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"sample.aop.monitor","sample.aop.service","sample.aop.controller"})
public class SampleAopApplication{

	// Simple example shows how an application can spy on itself with AOP


	public static void main(String[] args) {
		SpringApplication.run(SampleAopApplication.class, args);
	}

}