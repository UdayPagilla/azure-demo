package com.cloud.demo.clouddemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CloudDemoController {

	@GetMapping("/welcome")
	public String welcomreCloud() {
		return "welcome to azure cloud";
	}
}
