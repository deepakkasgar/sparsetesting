package com.security.ss.auth.resource.server.config.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/demo")
	public String getDemo() {
		return "demo";
	}
}
