package com.competitionApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.competitionApp.dao.CompetitorDao;
import com.competitionApp.model.Competitor;

@Controller
public class CreateUserController {

	@Autowired
	private CompetitorDao competitorDao;

	@RequestMapping(path="/", method=RequestMethod.GET)
	public String showMenuScreen() {
		return "menuScreen";
	}	
	
	@RequestMapping(path="/createUser", method=RequestMethod.GET)
	public String showNewUserForm() {
		return "/createUser";
	}
	
	@RequestMapping(path="/createUser", method=RequestMethod.POST)
	public String createNewCompetitor(@RequestParam String firstName, @RequestParam String lastName) {
		Competitor newCompetitor = new Competitor();
		newCompetitor.setFirstName(firstName);
		newCompetitor.setLastName(lastName);
		competitorDao.createNewCompetitor(newCompetitor);
		return "redirect:/";
	}
	
}
