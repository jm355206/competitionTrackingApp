package com.competitionApp.model;

public class Competitor {

	private long playerId;
	private String firstName;
	private String lastName;
	
	public long getPlayerId() {
		return playerId;
	}

	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}

	public void setPlayerId(long id) {
		this.playerId = id;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
