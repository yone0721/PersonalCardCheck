package com.example.demo.Repository;

import java.util.List;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Arcana;

@Repository
public class ArcanaRepository {
	private final String SQL_FIND_ALL ="""
			SELECT *
			FROM arcana
			"""; 
	private final NamedParameterJdbcTemplate jdbcTemplate;

	public ArcanaRepository(NamedParameterJdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<Arcana> findAll(){
		List<Arcana> arcanaList = jdbcTemplate.query(SQL_FIND_ALL,
				(rs,rowNum) -> new Arcana(
						rs.getInt("arcana_no"),
						rs.getString("arcana_name"),
						rs.getString("nomal_mean"),
						rs.getString("reverse_mean"),
						rs.getString("persona")
						)); 
		return arcanaList;
		
	}

}
