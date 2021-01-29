package mypack;

import java.io.IOException;

public class Match {

	private String team1;
	private String team2;
	private int team1Runs;
	private int team2Runs;
	private int team1Wickets;
	private int team2Wickets;
	private String matchResult;
	private String team1_Vs_Team2;

	public String getTeam1() {
		return team1;
	}

	public void setTeam1(String team1) {
		this.team1 = team1;
	}

	public String getTeam2() {
		return team2;
	}

	public void setTeam2(String team2) {
		this.team2 = team2;
	}

	public int getTeam1Runs() {
		return team1Runs;
	}

	public void setTeam1Runs(int team1Runs) {
		this.team1Runs = team1Runs;
	}

	public int getTeam2Runs() {
		return team2Runs;
	}

	public void setTeam2Runs(int team2Runs) {
		this.team2Runs = team2Runs;
	}

	public int getTeam1Wickets() {
		return team1Wickets;
	}

	public void setTeam1Wickets(int team1Wickets) {
		this.team1Wickets = team1Wickets;
	}

	public int getTeam2Wickets() {
		return team2Wickets;
	}

	public void setTeam2Wickets(int team2Wickets) {
		this.team2Wickets = team2Wickets;
	}

	public String getMatchResult() {
		return matchResult;
	}

	public void setMatchResult(String matchResult) {
		this.matchResult = matchResult;
	}

	public void playMatch(Services service) throws IOException {

		System.out.println("Enter 1st Team Name : ");
		String temp_Name1 = service.br.readLine();

		if (service.checkTeamExistance(temp_Name1)) {

			team1 = temp_Name1;
		} else {
			System.out.println("Team Does not Exist In System ...");
		}

		System.out.println("Enter 2st Team Name : ");
		String temp_Name2 = service.br.readLine();

		if (service.checkTeamExistance(temp_Name2)) {

			team2 = temp_Name2;
		} else {
			System.out.println("Team Does not Exist In System ...");
		}
		team1_Vs_Team2 = team1 + " V/S " + team2;
		System.out.println("**********" + team1_Vs_Team2 + "************");

		System.out.println("Enter Team 1 Runs");
		team1Runs = Integer.parseInt(service.br.readLine());
		System.out.println("Enter Team 2 Runs");
		team2Runs = Integer.parseInt(service.br.readLine());
		System.out.println("Enter Team 1 Wickets");
		team1Wickets = Integer.parseInt(service.br.readLine());
		System.out.println("Enter Team 2 Wickets");
		team2Wickets = Integer.parseInt(service.br.readLine());

		if (team1Runs == team2Runs) {

			System.out.println("Team : " + team1 + " Team Runs : " + team1Runs + " Wickets : " + team1Wickets);
			System.out.println("Team : " + team2 + " Team Runs : " + team2Runs + " Wickets : " + team2Wickets);
			matchResult = "Match Is Drwa...!";
			System.out.println("Match Result : " + matchResult);
		} else if (team1Runs > team2Runs) {
			System.out.println("Team : " + team1 + " Team Runs : " + team1Runs + " Wickets : " + team1Wickets);
			System.out.println("Team : " + team2 + " Team Runs : " + team2Runs + " Wickets : " + team2Wickets);
			matchResult = team1 + "Is Won...! ";

		} else {
			System.out.println("Team : " + team1 + " Team Runs : " + team1Runs + " Wickets : " + team1Wickets);
			System.out.println("Team : " + team2 + " Team Runs : " + team2Runs + " Wickets : " + team2Wickets);
			matchResult = team2 + "Is Won...!";
		}

	}

}
