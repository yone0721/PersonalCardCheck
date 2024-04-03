package com.example.demo.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name="arcana")
@Entity
public class Arcana {
	
	@Id
	@Column(value = "arcana_no")
	private int arcanaNumber;
	
	@Column(value = "arcana_name")
	private String arcanaName;
	
	@Column(value = "nomal_mean")
	private String nomalMean;
	
	@Column(value = "reverse_mean")
	private String reverseMean;
	
	@Column(value = "persona")
	private String persona;
	
	public Arcana() {
		
	}
	
	@Autowired
	public Arcana(int arcanaNo,String arcanaName,String nomalMean,String reverseMean,String persona) {
		setArcanaNumber(arcanaNo);
		setArcanaName(arcanaName);
		setNomalMean(nomalMean);
		setReverseMean(reverseMean);
		setPersona(persona);
	}
	
}
