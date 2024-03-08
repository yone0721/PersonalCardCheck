package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PersonalCardController {
	private ArcanaService arcanaService = new ArcanaServiceImpl();
	
	@PostMapping("input-birthday")
	public ModelAndView checkPersonalCard(String birthday,ModelAndView mav) {
		this.arcanaService.setBirthday(birthday);
		
		try {	
			List<String> checkResult = new ArrayList<>();
			checkResult = this.arcanaService.getResult();
		
		
			mav.setViewName("html/personal-card-result.html");
			mav.addObject("personal-card",checkResult.get(0));
			mav.addObject("soul-card",checkResult.get(1));
			
			return mav;		
			
		}catch(Exception e) {
			mav.setViewName("html/personal-card-error.heml");
			return mav;
		}
		
	}
}
