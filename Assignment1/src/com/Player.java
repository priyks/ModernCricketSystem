package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Player implements PlayerService {

	private static String name;
	private int run;
	private int wickets;
	private  static final ArrayList<Player> playerListIndia = new ArrayList<Player>();
	private  static final ArrayList<Player> playerListNewzealand = new ArrayList<Player>();
	private  static final ArrayList<Player> playerListAustralia = new ArrayList<Player>();
	public Player(String name, int run, int wickets) {
		super();
		this.name = name;
		this.run = run;
		this.wickets = wickets;
		
		
	}
    public static ArrayList<Player> createPlayerIndianTeam() {
    	
    	playerListIndia.add(new Player("M S Dhoni", 224, 4));
    	playerListIndia.add(new Player("Virat Kohli", 154, 2));
    	playerListIndia.add(new Player("Hardik Pandya", 120, 4));
    	playerListIndia.add(new Player("Rohit Sharma", 103, 1));
    	playerListIndia.add(new Player("R Ashwin", 100, 0));
    	playerListIndia.add(new Player("KL Rahul", 55, 5));
    	playerListIndia.add(new Player("Rishabh Pant", 33, 2));
    	playerListIndia.add(new Player("Ravindra Jadeja", 10, 1));
    	playerListIndia.add(new Player("T. Natarajan", 1, 3));
    	playerListIndia.add(new Player("Jasprit Bumrah", 15, 0));

    	
    	return playerListIndia;
    	
    }
    
    public static ArrayList<Player> createPlayerAustraliaTeam() {
    	
    	playerListNewzealand.add(new Player("Steve Smith", 114, 3));
    	playerListNewzealand.add(new Player("David Warner", 14, 0));
    	playerListNewzealand.add(new Player("Pat Cummins", 100, 4));
    	playerListNewzealand.add(new Player("Aaron Frinch", 203, 1));
    	playerListNewzealand.add(new Player("Mitchell Starc", 10, 2));
    	playerListNewzealand.add(new Player("Glenn Maxwell", 104, 0));
    	playerListNewzealand.add(new Player("Nathan Lyon", 4, 0));
    	playerListNewzealand.add(new Player("Adam Zampa", 1, 0));
    	playerListNewzealand.add(new Player("Mattaw Wade", 50, 2));
    	playerListNewzealand.add(new Player("Will Pucovski", 4, 0));
    	
    	return playerListNewzealand;
    	
    }
    
    public static ArrayList<Player> createPlayerNewzealandTeam() {
    	
    	playerListAustralia.add(new Player("Kane Willamson", 114, 3));
    	playerListAustralia.add(new Player("Ross Taylor", 104, 0));
    	playerListAustralia.add(new Player("Trent Boult", 100, 4));
    	playerListAustralia.add(new Player("Martin Gutill", 23, 1));
    	playerListAustralia.add(new Player("James Neesham", 50, 2));
    	playerListAustralia.add(new Player("Tim Southee", 174, 0));
    	playerListAustralia.add(new Player("Locike Ferguson", 44, 0));
    	playerListAustralia.add(new Player("Mitchell Santner",21, 0));
    	playerListAustralia.add(new Player("Henry Nicholls", 150, 2));
    	playerListAustralia.add(new Player("Tomm Latham", 24, 0));
    	
    	return playerListAustralia;
    	
    }
    
    public static ArrayList<Player> getPlayerListIndia(){
    	
    	return playerListIndia;
    }
    public static ArrayList<Player> getPlayerListNewZealand(){
    	
    	return playerListNewzealand;
    }
    public static ArrayList<Player> getPlayerListAustralia(){
    	
    	return playerListAustralia;
    }
    
	public  static String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRun() {
		return run;
	}

	public void setRun(int run) {
		this.run = run;
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}


	public static void setPlayerList1(ArrayList<Player> playerList) {

		playerListIndia.addAll(playerList);
	}
	public static void setPlayerList2(ArrayList<Player> playerList) {

		playerListNewzealand.addAll(playerList);
	}
	public static void setPlayerList3(ArrayList<Player> playerList) {

		playerListAustralia.addAll(playerList);
	}

	@Override
	public void addPlayer() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletePlayer() {
		// TODO Auto-generated method stub

	}

	@Override
	public  boolean searchPlayer(String name) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void displayPlayerDetails() {
		// TODO Auto-generated method stub

	}
	
	public static Comparator<Player> playerNam = new Comparator<Player>() {

		public int compare(Player p1, Player p2) {

		   String player1 = p1.getName();
		   String player2 = p2.getName();

		 
		   return player1.compareTo(player2);

	   }};
	   
	 public static  void sortPlayerListIndia() {
		 Collections.sort(playerListIndia, Player.playerNam);

			for (Player p :playerListIndia ) {
				System.out.println(p.getName());
			}
			
	 }
	 
	 public static  void sortPlayerListNewzealand() {
		 Collections.sort(playerListNewzealand, Player.playerNam);

			for (Player p :playerListNewzealand ) {
				System.out.println(p.getName());
			}

	 }
	 
	 public static void sortPlayerListAustralia() {
		 
		 Collections.sort(playerListAustralia, Player.playerNam);

			for (Player p :playerListAustralia ) {
				System.out.println(p.getName());
			}

	 }
}
