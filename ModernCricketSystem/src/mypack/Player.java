package mypack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Player {

	private String name;
	private PlayerCategory category = PlayerCategory.BATSMEN;
	private Player_Role_In_Match role = Player_Role_In_Match.PLAYER;
	private int runs;
	private int wickets;
	private int age;
	private int innings = 4;
	private int avgRuns;
	private String playFor = "Undefined";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PlayerCategory getCategory() {
		return category;
	}

	public void setCategory(PlayerCategory category) {
		this.category = category;
	}

	public Player_Role_In_Match getRole() {
		return role;
	}

	public void setRole(Player_Role_In_Match role) {
		this.role = role;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getInnings() {
		return innings;
	}

	public void setInnings(int innings) {
		this.innings = innings;
	}

	public int getAvgRuns() {
		return avgRuns;
	}

	public void setAvgRuns(int avgRuns) {
		this.avgRuns = avgRuns;
	}

	public String getPlayFor() {
		return playFor;
	}

	public void setPlayFor(String playFor) {
		this.playFor = playFor;
	}

	public void createPlayer(Services service) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Player Name : ");
		name = br.readLine();
		System.out.println("Enter Player Age :");
		age = Integer.parseInt(br.readLine());

		System.out.println("Define Player :");
		System.out.println("Enter 1 For Captain :");
		System.out.println("Enter 2 For Vice-Captain :");
		System.out.println("Enter 3 For Player :");

		int choice = Integer.parseInt(br.readLine());
		switch (choice) {

		case 1:
			role = Player_Role_In_Match.CAPTAIN;
			break;
		case 2:
			role = Player_Role_In_Match.VICE_CAPTAIN;
			break;
		case 3:
			role = Player_Role_In_Match.PLAYER;
			break;
		case 4:
			break;

		}

		System.out.println("Player Category :");

		System.out.println("Enter 1 For Batsmen");
		System.out.println("Enter 2 For Bowller");
		System.out.println("Enter 3 For AllRounder");
		System.out.println("Enter 4 for WicketKeeper");
		int categoryChoice = Integer.parseInt(br.readLine());
		switch (categoryChoice) {

		case 1:
			category = PlayerCategory.BATSMEN;
			break;
		case 2:
			category = PlayerCategory.BOWLER;
			break;
		case 3:
			category = PlayerCategory.ALLROUNDER;
			break;
		case 4:
			category = PlayerCategory.WICKETKEEPER;
		case 5:
			break;

		}

		System.out.println("Enter Total Runs ");
		runs = Integer.parseInt(br.readLine());
		System.out.println("Enter Total Wickets he have Taken");
		wickets = Integer.parseInt(br.readLine());
		System.out.println("Total Innings He Played ");
		innings = Integer.parseInt(br.readLine());
		avgRuns = runs / innings;

	}

	public void showPlayer() {
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Category : " + category);
		System.out.println("Role assigned : " + role);
		System.out.println("Runs :" + runs);
		System.out.println("Innings :" + innings);
		System.out.println("Average Runs " + avgRuns);
		System.out.println("Player For which Team : " + playFor);

	}
}
