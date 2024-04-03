package com.example.demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example.demo")
public class PersonalCardConfig {
	
//	@Bean
//	public PersonalCardController personalCardController(ArcanaServiceImpl arcanaService) {
//		return new PersonalCardController(arcanaService);
//		}
//	
//	@Bean 
//	public ArcanaServiceImpl arcanaService(ArcanaRepository arcanaRepository) {
//		return new ArcanaServiceImpl(arcanaRepository);
//	}
//	
//	@Bean
//	public ArcanaRepository arcanaRepository(NamedParameterJdbcTemplate jdbcTemplate) {
//		return new ArcanaRepository(jdbcTemplate);
//	}
//	
//	
}
