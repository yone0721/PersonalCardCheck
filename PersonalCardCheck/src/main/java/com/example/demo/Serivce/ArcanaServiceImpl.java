package com.example.demo.Serivce;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.Arcana;
import com.example.demo.Repository.ArcanaRepository;

@Service
public class ArcanaServiceImpl implements ArcanaService{
	private String birthday;
	private Arcana personalCard;
	private Arcana soulCard;
	private List<Arcana> arcanaList;
	
	private final ArcanaRepository arcanaRepository;

	public ArcanaServiceImpl(ArcanaRepository arcanaRepository) {
		this.arcanaRepository = arcanaRepository;
		this.arcanaList = this.arcanaRepository.findAll();
		
	}

	public void calcBirthdayNumbers() {
		int total=0;
		char[] numbers = this.birthday.toCharArray();
		
		for(char num:numbers) {
			total += Character.getNumericValue(num);
		}
		
		
		checkPersonalCard(total);
		checkSoulCard(total);
	}
	
	public int calcDigit(int number) {
		int total =0;
		int[] splitDigit = String.valueOf(number).chars().map(Character::getNumericValue).toArray();
		
		for(int digit:splitDigit) {
			total += digit;
		}
		
		return total;
	}
	
	public void checkPersonalCard(int number) {
		
		while(number > 21) {
			number -= 22;
		}
		
		
		for(Arcana arcana:arcanaList) {
			if(number == arcana.getArcanaNumber()) {
				this.personalCard = arcana;
				break;
			}	
		}
	}
	
	public void checkSoulCard(int number) {
		int total = calcDigit(number);
		
		while(total >= 10) {
			total = calcDigit(total);
		}

		for(Arcana arcana:arcanaList) {
			if(total == arcana.getArcanaNumber()) {
				this.soulCard = arcana;
				break;
			}	
		}
	}

	@Override
	public void setBirthday(String birthday) {
		// TODO 自動生成されたメソッド・スタブ
		this.birthday = birthday;		
	}

	@Override
	public String getBirhtday() {
		// TODO 自動生成されたメソッド・スタブ
		return this.birthday;
	}
	@Override
	public Arcana getPersonalCard() {
		// TODO 自動生成されたメソッド・スタブ
		return this.personalCard;
	}

	@Override
	public Arcana getSoulCard() {
		// TODO 自動生成されたメソッド・スタブ
		return this.soulCard;
	}

	
}
