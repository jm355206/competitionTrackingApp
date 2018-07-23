package com.competitionApp.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import com.competitionApp.model.Game;

@Component
public class JdbcGameDao {

	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public JdbcGameDao(DataSource datasource) {
		this.jdbcTemplate = new JdbcTemplate(datasource);
	}
	
	
	

	public List<Game> getAllGames() {
		List<Game> allGames = new ArrayList<>();
		String sqlAllGames = "SELECT * FROM games";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlAllGames);
		while(results.next()) {
			allGames.add(mapRowToGame(results));
		}
		return allGames;
	}
	
	private Game mapRowToGame(SqlRowSet results) {
		Game game = new Game();
		game.setGameId(results.getLong("game_id"));
		game.setGameName(results.getString("game_name"));
		game.setGameType(results.getString("game_type"));	

		return game;
	}
	
}	
