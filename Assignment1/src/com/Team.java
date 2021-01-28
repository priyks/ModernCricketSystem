package com;

import java.util.ArrayList;

public class Team implements TeamService {

	private static int teamNo;
	private String teamName;
	private ArrayList<Team> teamList = new ArrayList<>();

	public Team(int teamNo, String teamName) {
		super();
		this.teamNo=teamNo;
		this.teamName = teamName;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	@Override
	public void addTeam() {
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayList<Team> getTeam() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void searchTeam() {
		// TODO Auto-generated method stub

	}

	@Override
	public void displayTeamDetails() {
		// TODO Auto-generated method stub
		

	}

	@Override
	public void sortTeam() {
		// TODO Auto-generated method stub

	}
}
