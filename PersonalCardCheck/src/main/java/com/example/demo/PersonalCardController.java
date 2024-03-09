package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class PersonalCardController {
	private ArcanaService arcanaService;
		
	@PostMapping("/personal-card-result")
	public String checkPersonalCard(@RequestParam("birthday") String birthday,Model model) {
		this.arcanaService = new ArcanaServiceImpl();
		this.arcanaService.setBirthday(birthday);
		
		try {	
			String personalCard = arcanaService.getPersonalCard();
			String soulCard = arcanaService.getSoulCard();
		
			model.addAttribute("personalCard",personalCard);
			model.addAttribute("soulCard",soulCard);
			
			return "html/personal-card-result.html";		
			
		}catch(Exception e) {
			return "html/personal-card-result.html";
		}
		
	}
}
