package com.example.demo.Serivce;

import com.example.demo.Entity.Arcana;


public interface ArcanaService{
	
	void setBirthday(String Birthday);
	
	String getBirhtday();
	
	Arcana getSoulCard();

	Arcana getPersonalCard();
	
}