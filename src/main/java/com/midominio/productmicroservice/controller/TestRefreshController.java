package com.midominio.productmicroservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RefreshScope
public class TestRefreshController {
	
	@Value("${application.test.dev}")
	private String testProperty;
	
	@GetMapping("/test")
	public String index() {
		return testProperty;
	}
	
}
