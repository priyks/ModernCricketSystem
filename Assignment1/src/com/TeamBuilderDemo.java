package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TeamBuilderDemo {

	static Scanner sc = new Scanner(System.in);
	static String teamName;
	static int no;
	static TreeMap<String, ArrayList<Player>> team = new TreeMap<String, ArrayList<Player>>();
	static ArrayList<Player> playerList1 = new ArrayList<Player>();
	static ArrayList<Player> playerList2 = new ArrayList<Player>();
	static ArrayList<Player> playerList3 = new ArrayList<Player>();

	public static void main(String args[]) {

		int e = 0;

		do {
			System.out.println("-------------------------Cricket Team Building System--------------------");
			System.out.println("Press 1: to Add Team In System :");
			System.out.println("Press 2: to Add Players In Team: ");
			System.out.println("Press 3: to Display Team Details ");
			System.out.println("Press 4: to Display total Teams in System :");
			System.out.println("Press 5: to Sort Team by Name : ");
			System.out.println("Press 6: to Sort Player List : ");
			System.out.println("Press 7: to Search Team : ");
			System.out.println("Press 8: to Search Player : ");
			System.out.println("Press 9: to exit from System");

			int choice;
			System.out.println("Enter Your Choice ...");
			choice = sc.nextInt();
			switch (choice) {

			case 1:
				System.out.println("Enter Team No");
				no = sc.nextInt();
				System.out.println("Enter Team Name");
				teamName = sc.next();

				Team t = new Team(no, teamName);
				System.out.println("Team Successfully Added " + teamName);

				break;

			case 2:
				int h = 0;
				do {

					System.out.println("Press 10 to Create Indian Player List");
					System.out.println("Press 11 to Create NewZealand Player List");
					System.out.println("Press 12 to Create Australia Player List");
					System.out.println("Press 13 to Exit From player Menu.....");
					System.out.println("Enter Your Choice...?");

					int choice1 = sc.nextInt();

					switch (choice1) {

					case 10:

						team.put("India", Player.createPlayerIndianTeam());
						System.out.println("Indian Players Are Added In System...\n");
						break;
					case 11:

						team.put("Newzealand", Player.createPlayerNewzealandTeam());
						System.out.println("Newzealand Players Are Added In System...\n");
						break;
					case 12:

						team.put("Australia", Player.createPlayerAustraliaTeam());
						System.out.println("Australia Players Are Added In System...\n");

					case 13:
						h = 4;
						break;

					default:
						System.out.println("You have Entered Wrong Choice....!");
					}
				} while (h != 4);

				break;

			case 3:
				System.out.println("----------------------Team Details------------------------------");

				Iterator<Map.Entry<String, ArrayList<Player>>> itr = team.entrySet().iterator();

				while (itr.hasNext()) {
					Entry<String, ArrayList<Player>> entry = itr.next();

					System.out.println("Team Name : " + entry.getKey() + "\n");

				}

				break;

			case 4:
				System.out.println("--------------------------Total Teams in System---------------------\n");
				System.out.println(team.size());

				break;

			case 5:

				System.out.println("---------------------------Sorted Team by Name------------------------\n");
				Iterator<Map.Entry<String, ArrayList<Player>>> itr1 = team.entrySet().iterator();

				while (itr1.hasNext()) {
					Entry<String, ArrayList<Player>> entry = itr1.next();

					System.out.println("Team Name : " + entry.getKey() + "\n");
				}

				break;

			case 6:

				System.out.println("---------------------------Sorted Player by Name------------------------\n");

				System.out.println("\nIndian Player Sorted List \n ");
				playerList1 = Player.getPlayerListIndia();
				Collections.sort(playerList1, Player.playerNam);

				for (Player p : playerList1) {
					System.out.println(p.getName()+" Runs : "+p.getRun()+" Wickets taken by him  : "+p.getWickets());
				}
				System.out.println("\nNewZealand Player Sorted List \n ");
				playerList2 = Player.getPlayerListNewZealand();
				Collections.sort(playerList2, Player.playerNam);

				for (Player p : playerList2) {
					System.out.println(p.getName()+"  Runs : "+p.getRun()+" Wickets taken by him : "+p.getWickets());
				}

				System.out.println("\nAustralia Player Sorted List \n ");
				playerList3 = Player.getPlayerListAustralia();

				Collections.sort(playerList3, Player.playerNam);

				for (Player p : playerList3) {
					System.out.println(p.getName()+"  Runs : "+p.getRun()+" Wickets taken by him : "+p.getWickets());
				}
				break;

			case 7:

				System.out.println("---------------------------Search Team by Name------------------------");
			
				System.out.println("Enter Team Name to Search  :");
				
				String searchkey = sc.next();
				
				boolean result = team.containsKey(searchkey);
				if (result) {
					System.out.println("Team is Present In System ");
				} else {
					System.out.println("Team Does Not exist in System ");
				}
				break;

			case 8:

				System.out.println("--------------------------- Search Player Name------------------------"); // update
				System.out.println("Enter Team Player Name to Search  :");
				
				String playerkey = sc.next();
				if (playerList1.contains(playerkey)) {
					System.out.println("Player Present in the Inidan Team");
				} else if (playerList2.contains(playerkey)) {
					System.out.println("Player Present in the NewZealand Team");
				} else if (playerList3.contains(playerkey)) {
					System.out.println("Player Present in the Australia Team");

				} else {
					System.out.println("Player does not present in system..");
				}
				break;

			case 9:
				e = 9;
				break;

			}
		} while (e != 9);

	}

}
