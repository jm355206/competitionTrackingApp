package com.competitionApp.dao;

import java.util.List;

import com.competitionApp.model.Competitor;

public interface CompetitorDao {

	public void createNewCompetitor(Competitor competitor);
	
	public List<Competitor> listCompetitors();
}
