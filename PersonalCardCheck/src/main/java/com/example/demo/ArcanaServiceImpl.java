package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class ArcanaServiceImpl implements ArcanaService{
	private String birthday;
	private String[] checkResult = new String[2];
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
	}
	
	public void checkPersonalCard(int number) {
		
		while(number > 21) {
			number -= 22;
		}
		
		this.checkResult[0] = this.Arcana[number];
		
		checkSoulCard(number);
	}
	public void checkSoulCard(int number) {
		int[] digit = String.valueOf(number).chars().map(Character::getNumericValue).toArray();
		int total = 0;
		for(int dig:digit) {
			total += dig;
		}
		
		this.checkResult[1] = this.Arcana[total];
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
	public String[] getResult(){
		return this.checkResult;
	}
	
}
