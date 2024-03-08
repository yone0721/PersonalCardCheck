package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class PersonalCardController {
	private ArcanaService arcanaService;
		
	@GetMapping("/input-birthday")
	public ModelAndView checkPersonalCard(String birthday,ModelAndView mav) {
		this.arcanaService = new ArcanaServiceImpl();
		this.arcanaService.setBirthday(birthday);
		
		try {	
			String[] checkResult = this.arcanaService.getResult();
		
		
			mav.setViewName("html/personal-card-result.html");
			mav.addObject("personal-card",checkResult[0]);
			mav.addObject("soul-card",checkResult[1]);
			
			return mav;		
			
		}catch(Exception e) {
			mav.setViewName("html/personal-card-error.heml");
			return mav;
		}
		
	}
}
