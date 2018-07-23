package com.competitionApp.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.competitionApp.dao.CompetitionDao;

public class Competition{

	private Long competitionId;
	private Long gameChosen;
	private Long competitorOne;
	private Long competitorTwo;
	private LocalDateTime timeStamp;
	private Long competitorOneScore;
	private Long competitorTwoScore;
	private String gameComments;
	
	public Long getCompetitionId() {
		return competitionId;
	}
	public void setCompetitionId(Long competitionId) {
		this.competitionId = competitionId;
	}
	public Long getGameChosen() {
		return gameChosen;
	}
	public void setGameChosen(Long gameChosen) {
		this.gameChosen = gameChosen;
	}
	public Long getCompetitorOne() {
		return competitorOne;
	}
	public void setCompetitorOne(Long competitorOne) {
		this.competitorOne = competitorOne;
	}
	public Long getCompetitorTwo() {
		return competitorTwo;
	}
	public void setCompetitorTwo(Long competitorTwo) {
		this.competitorTwo = competitorTwo;
	}
	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(LocalDateTime localDateTime) {
		this.timeStamp = localDateTime;
	}
	public Long getCompetitorOneScore() {
		return competitorOneScore;
	}
	public void setCompetitorOneScore(Long competitorOneScore) {
		this.competitorOneScore = competitorOneScore;
	}
	public Long getCompetitorTwoScore() {
		return competitorTwoScore;
	}
	public void setCompetitorTwoScore(Long competitorTwoScore) {
		this.competitorTwoScore = competitorTwoScore;
	}
	public String getGameComments() {
		return gameComments;
	}
	public void setGameComments(String gameComments) {
		this.gameComments = gameComments;
	}
	
	
	
}
