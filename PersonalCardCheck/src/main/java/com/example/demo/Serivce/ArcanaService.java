package com.example.demo.Serivce;

import com.example.demo.Entity.Arcana;


public interface ArcanaService{

	void calcBirthdayNumbers();
	
	int calcDigit(int number);
	
	void checkPersonalCard(int number);
	
	void checkSoulCard(int number);
	
	void setBirthday(String Birthday);
	
	String getBirhtday();
	
	Arcana getSoulCard();

	Arcana getPersonalCard();
}