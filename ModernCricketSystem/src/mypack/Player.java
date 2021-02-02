package mypack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * This class implements a simple player who can be added in team
 * 
 * @author priyankaku
 * @version 0.2
 *
 */
public class Player {

	private String name;
	private PlayerCategory category = PlayerCategory.BATSMEN;
	private int runs;
	private int wickets;
	private String playFor = "Undefined";

	public Player() {
		super();
	}
    /**
     * Constructs a Player with name
     * @param name
     */
	public Player(String name) {
		super();
		this.name = name;
	}

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

	}

	public void showPlayer() {
		System.out.println("Name : " + name);
		System.out.println("Category : " + category);
		System.out.println("Runs :" + runs);
		System.out.println("Player For which Team : " + playFor);

	}
}
