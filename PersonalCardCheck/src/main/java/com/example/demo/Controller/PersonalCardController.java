package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Entity.Arcana;
import com.example.demo.Serivce.ArcanaService;

import lombok.RequiredArgsConstructor;


@Controller
@RequiredArgsConstructor
public class PersonalCardController {
	
	private final ArcanaService arcanaServiceImpl;
	
//	@Autowired
//	public PersonalCardController(ArcanaServiceImpl arcanaService) {
//		this.arcanaServiceImpl = arcanaService;
//	};
		
	@PostMapping("/personal-card-result")
	public String checkPersonalCard(@RequestParam("birthday") String birthday,Model model) {
		this.arcanaServiceImpl.setBirthday(birthday);
		
		try {	
			Arcana personalCard = arcanaServiceImpl.getPersonalCard();
			Arcana soulCard = arcanaServiceImpl.getSoulCard();
		
			model.addAttribute("personalCard",personalCard);
			model.addAttribute("soulCard",soulCard);
			
			return "html/personal-card-result.html";		
			
		}catch(Exception e) {
			return "html/personal-card-result.html";
		}
	}
}
