package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.CredentialsConfiguration;


@RestController
public class HelloController {
	
	@Value("${welcome.message}")
	public String welcomeMessage;
	
	@RequestMapping("/h")
	public String welcome() {
		return "Hello Iam Akash from Kochi..";
	}
	@RequestMapping("/hello")
	public String hello() {
		return "Hello from Hello controller"+welcomeMessage;
	}
	
	@Autowired
	CredentialsConfiguration credentialsconfiguration;
	@RequestMapping("/printcredentials")
	public String printCredentials() {
		return "Username is :"+credentialsconfiguration.getUsername();
	}
	
}
