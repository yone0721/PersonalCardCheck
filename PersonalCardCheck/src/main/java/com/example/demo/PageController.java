package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
	
	@RequestMapping("index")
	public String topPage() {
		return "index.html";
	}
	
	@RequestMapping("fotune-telling")
	public String fotuneTelling() {
		return "html/fotune-telling.html";
	}
	@RequestMapping("personal-card")
	public String personalCard() {
		return "html/personal-card-check.html";
	}
}
