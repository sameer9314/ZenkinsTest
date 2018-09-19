package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsController {
	
	@RequestMapping("/")
	public String checkConnection() {
		return "<html><body><h1 style=color:blue>Connection Stablished</h1></body></html>";
	}
}
