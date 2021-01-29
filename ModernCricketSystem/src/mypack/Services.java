package mypack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Services {

	public List<Team> teamList = new ArrayList<Team>();
	public List<Player> playerList = new ArrayList<Player>();
	public List<Match> matchList=new ArrayList<Match>();
	
	public BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public void addPlayerInTeam(String name) throws IOException {

		for (Player player : playerList) {

			if (player.getName().equals(name)) {
				System.out.println("Enter Team Name : ");
				String tname = br.readLine();
				if (checkTeamExistance(tname)) {

					player.setPlayFor(tname);
					System.out.println("Player is Added...");
				} else {
					System.out.println("Team does not Exist for team name " + tname);
				}

			}
		}

	}

	public void removePlayerFromTeam(String pname) {

		for (Player player : playerList) {

			if (player.getName().equals(pname)) {
				System.out.println("Player name : " + player.getName());
				System.out.println("Team Name : " + player.getPlayFor());
				player.setPlayFor("Undefined");
				System.out.println("Updated Player Status : " + player.getPlayFor());
			} else {
				System.out.println("Player does not Exist..");
			}
		}
	}

	public boolean checkTeamExistance(String teamName) {

		boolean result = false;

		for (Team t : teamList) {
			if (t.getTeamName().equals(teamName)) {

				result = true;
			}
		}

		return result;
	}

	public void searchTeamByName(String tname) {

		for (Team t : teamList) {

			if (t.getTeamName().equalsIgnoreCase(tname)) {
				System.out.println("Team is Exist In System : " + t.getTeamName());
				System.out.println("Team Creation date : " + t.getCreationDate());
			} else {
				System.out.println("Team does not Exist In System :" + tname);
			}
		}
	}

	public void searchPlayerByName(String pname) {

		for (Player p : playerList) {

			if (p.getName().equalsIgnoreCase(pname)) {

				System.out.println("Player is Exist In System : " + p.getName() + " Plays for : " + p.getPlayFor());
				System.out.println("Age : " + p.getAge());
				System.out.println("Runs : " + p.getRuns());
				System.out.println("Wickets : " + p.getWickets());
				System.out.println("Innings : " + p.getInnings());
				System.out.println("Role : " + p.getRole());
				System.out.println("category : " + p.getCategory());
			} else {
				System.out.println("Player does not Exist In System : " + pname);
			}
		}
	}

	public void totalTeamsInSystem() {

		System.out.println("There are : " + teamList.size() + " Teams in System ");
	}

	public void sortTeamByName() {

		System.out.println("There are : " + teamList.size() + " Teams in System ");
		System.out.println("Sorted List Of Teams : ");

		Collections.sort(teamList, new MyTeamComparator());
		for (Team t : teamList) {
			System.out.println(t.getTeamName());
		}

	}

	public void sortTeamByDate() {

		System.out.println("There are : " + teamList.size() + " Teams in System ");
		System.out.println("Sorted List Of Teams By Date : ");

		Collections.sort(teamList, new SortTeamByDateComparator());

		for (Team t : teamList) {
			System.out.println(t.getTeamName() + "  " + t.getCreationDate());
		}

	}

	public void sortTeamPlayersByName(String tname) {

		List<String> playerNameList = new ArrayList<String>();

		for (Player p : playerList) {

			String teamName = p.getPlayFor();
			if (teamName.equalsIgnoreCase(tname)) {
				playerNameList.add(p.getName());
			}
		}

		Collections.sort(playerNameList);
		for (String name : playerNameList) {
			System.out.println(name);
		}

	}
	
	public void showMatchdetails() {
		for(Match m: matchList) {
			
			System.out.println("team Name : "+ m.getTeam1()+" V\\S "+ " Team Name : "+m.getTeam2());
			System.out.println("Result : "+m.getMatchResult());
			
		}
	}
	
	
}
