package com.competitionApp.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import com.competitionApp.model.Competitor;

@Component
public class JdbcCompetitorDao implements CompetitorDao{
	
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public JdbcCompetitorDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public void createNewCompetitor(Competitor competitor) {
		String sqlCreateCompetitor = "INSERT INTO competitor(first_name, last_name) VALUES (?,?) RETURNING competitor_id";
		long id = jdbcTemplate.queryForObject(sqlCreateCompetitor, Long.class, competitor.getFirstName(), competitor.getLastName());
		competitor.setPlayerId(id);
	}
	
	public List<Competitor> listCompetitors(){
		List <Competitor> competitors = new ArrayList<>();
		String sqlListCompetitors = "SELECT * FROM competitor ORDER BY competitor_id";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlListCompetitors);
		while(results.next()) {
			competitors.add(mapRowToCompetitor(results));
		}
		return competitors;
	}
	
	private Competitor mapRowToCompetitor(SqlRowSet results) {
		Competitor competitor = new Competitor();
		competitor.setPlayerId(results.getLong("competitor_id"));
		competitor.setFirstName(results.getString("first_name"));
		competitor.setLastName(results.getString("last_name"));
		return competitor;
		}
}

