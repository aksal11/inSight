package com.example.inSight.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/test")
public class Controller {
	
	
	@GetMapping ("/status")
	public static String checkStatus() {
		return "no problems here";
	}

}
