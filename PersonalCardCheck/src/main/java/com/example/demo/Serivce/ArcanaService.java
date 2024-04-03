package com.example.demo.Serivce;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.Arcana;

@Service
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