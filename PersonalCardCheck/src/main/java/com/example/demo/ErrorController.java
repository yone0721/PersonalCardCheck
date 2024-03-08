package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/error")
@Controller
public class ErrorController {
	
	public String errorPage() {
		return "error.html";
	}
	
}
