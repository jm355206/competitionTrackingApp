package com.competitionApp;


import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.competitionApp.dao.CompetitionDao;
import com.competitionApp.dao.CompetitorDao;
import com.competitionApp.dao.GameDao;
import com.competitionApp.model.Competition;
import com.competitionApp.model.Competitor;

@Controller
public class CompetitionController {

	@Autowired
	private CompetitorDao competitorDao;
	
	@Autowired
	private CompetitionDao competitionDao;
	
	
	@RequestMapping(path="/logGame", method=RequestMethod.GET)
	public String showLogGameForm(ModelMap modelHolder) {
		modelHolder.put("competitors", competitorDao.listCompetitors());
		return "logGame";
	}
	
	@RequestMapping(path="/logGame", method=RequestMethod.POST)
	public String saveLoggedGame(@RequestParam Long competitorOne, 
								@RequestParam Long competitorTwo, 
								@RequestParam Long competitorOneScore,
								@RequestParam Long competitorTwoScore,
								@RequestParam Long game) {
		Competition competition = new Competition();
		competition.setCompetitorOne(competitorOne);
		competition.setCompetitorTwo(competitorTwo);
		competition.setCompetitorOneScore(competitorOneScore);
		competition.setCompetitorTwoScore(competitorTwoScore);
		competition.setTimeStamp(LocalDateTime.now());
		competition.setGameChosen(game);
		competitionDao.logNewCompetition(competition);
		return "redirect:/";
	}

}
	







