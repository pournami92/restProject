package com;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
//@ComponentScan(basePackages = "hello")
public class UstHelloAppApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(UstHelloAppApplication.class, args);
		String [] beanNames = ctx.getBeanDefinitionNames();
		
		Arrays.sort(beanNames);
		
		for(String bn:beanNames) {
			System.out.println(bn);
		}
	}
	@RequestMapping("/")
	public String sayHello() {
		return "Welcome to the first spring-boot";
	}
	@RequestMapping("/ust")
	public String ust() {
		return "UST-Global Bangalore";
	}
	@RequestMapping("/helloust")
	public String hUst() {
		return "UST-Global";
	}


}
