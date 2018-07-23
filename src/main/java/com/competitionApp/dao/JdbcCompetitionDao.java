package com.competitionApp.dao;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.sql.DataSource;

import org.bouncycastle.asn1.crmf.PKIPublicationInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.competitionApp.model.Competition;
import com.competitionApp.model.Competitor;

@Component
public class JdbcCompetitionDao implements CompetitionDao{
	
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public JdbcCompetitionDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public void logNewCompetition(Competition newCompetition) {
		String sqlNewCompetition = "INSERT INTO competition (game_id, time_stamp, player_one, player_one_score, player_two, player_two_score) VALUES (?, ?, ?, ?, ?, ?)";
		jdbcTemplate.update(sqlNewCompetition,
							newCompetition.getGameChosen(),
							newCompetition.getTimeStamp(),
							newCompetition.getCompetitorOne(),
							newCompetition.getCompetitorOneScore(),
							newCompetition.getCompetitorTwo(),
							newCompetition.getCompetitorTwoScore());
	}



//	public void saveLoggedGame(Competitor CompetitorOne, Competitor competitorTwo, String gameName, int competitorOneScore, int CompetitorTwoScore) {
//		String sqlInsertGame = "INSERT INTO competition("
//	}
}
