package com.example.demo.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="arcana")
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
	
	
}
