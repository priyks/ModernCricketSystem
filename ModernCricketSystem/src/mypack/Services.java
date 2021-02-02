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
	public List<Match> matchList = new ArrayList<Match>();

	public BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

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
				System.out.println("inside search for team : " + tname);
			}
		}
	}

	public void totalTeamsInSystem() {

		System.out.println("There are : " + teamList.size() + " Teams in System ");
	}

/*	public void sortTeamByName() {

		System.out.println("There are : " + teamList.size() + " Teams in System ");
		System.out.println("Sorted List Of Teams : ");

		Collections.sort(teamList, new MyTeamComparator());
		for (Team t : teamList) {
			System.out.println(t.getTeamName());
		}

	}*/

	public void sortTeamByDate() {

		System.out.println("There are : " + teamList.size() + " Teams in System ");
		System.out.println("Sorted List Of Teams By Date : ");

		Collections.sort(teamList, new SortTeamByDateComparator());

		for (Team t : teamList) {
			System.out.println(t.getTeamName() + "  " + t.getCreationDate());
		}

	}

	public void showMatchdetails() {
		for (Match m : matchList) {

			System.out.println("team Name : " + m.getTeam1() + " V\\S " + " Team Name : " + m.getTeam2());
			System.out.println("Result : " + m.getMatchResult());

		}
	}
	


}
