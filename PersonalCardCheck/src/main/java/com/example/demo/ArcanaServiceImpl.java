package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class ArcanaServiceImpl implements ArcanaService{
	private String birthday;
	private String personalCard;
	private String soulCard;	
	private String[] Arcana = {"愚者","魔術師","女教皇","女帝","皇帝",
			"法王","恋人","戦車","正義","隠者","運命の輪","力","吊られた男",
			"死神","節制","悪魔","塔","星","月","太陽","審判","世界"};
	
	public ArcanaServiceImpl() {

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
		
		this.personalCard = this.Arcana[number];
		
	}
	public void checkSoulCard(int number) {
		int total = calcDigit(number);
		
		while(total >= 10) {
			total = calcDigit(total);
		}

		this.soulCard = this.Arcana[total];			
	}
	
	@Override
	public void setBirthday(String birthday) {	
		this.birthday = birthday.replace('-', '0');
		calcBirthdayNumbers();
	}
	
	@Override
	public String getBirhtday() {
		return this.birthday;
	}
	
	@Override
	public String getPersonalCard(){
		return this.personalCard;
		
	}
	@Override
	public String getSoulCard(){
		return this.soulCard;
		
	}
	
}
