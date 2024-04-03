package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Entity.Arcana;
import com.example.demo.Serivce.ArcanaServiceImpl;


@Controller
//@RequiredArgsConstructor
public class PersonalCardController {
	
	private ArcanaServiceImpl arcanaService;
	
	public PersonalCardController(ArcanaServiceImpl arcanaService) {
		this.arcanaService = arcanaService;
	};
		
	@PostMapping("/personal-card-result")
	public String checkPersonalCard(@RequestParam("birthday") String birthday,Model model) {
		this.arcanaService.setBirthday(birthday);
		this.arcanaService.calcBirthdayNumbers();
		
		try {	
			Arcana personalCard = arcanaService.getPersonalCard();
			Arcana soulCard = arcanaService.getSoulCard();
		
			model.addAttribute("personalCard",personalCard);
			model.addAttribute("soulCard",soulCard);
			
			return "html/personal-card-result.html";		
			
		}catch(Exception e) {
			return "html/personal-card-result.html";
		}
	}
}
