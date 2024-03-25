package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@RequestMapping("/error")
@Controller
public class ErrorController {
	
	public String hangError(HttpServletRequest req,HttpServletResponse res) {
		Integer errorCode = (Integer) req.getAttribute("javax.servlet.error.status_code");
		Throwable exception = (Throwable)req.getAttribute("javax.servlet.error.exception");
		String message = (String)req.getAttribute("javax.servlet.error.message");
		
		req.setAttribute("errorMessage",message);
		req.setAttribute("exception",exception);
		return "error.html";
	}
	
}
