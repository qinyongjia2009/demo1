package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
//	@Autowired
//	private HttpClient client;
	
	@GetMapping(value = "/hello")
	public String hello(){
		system.out.println("i come from github");
//		String url = "http://localhost:8081/user/";
//		HttpMethod method = HttpMethod.GET;
//		MultiValueMap<String, String> params = new LinkedMultiValueMap<String, String>();
//		params.add("name", "qinyongjia");
//		return client.client(url, method, params);
		return "hello !";
		
	}
	

}
