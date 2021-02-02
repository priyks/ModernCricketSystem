package mypack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * This class is used for constructing team with TeamName and creationDate
 * 
 * @author priyankaku
 *
 */
public class Team {
	private String teamName;
	private Date creationDate;
	public Set<String> teamPlayers = new TreeSet<String>();
	public List<Player> players = new ArrayList<Player>();
	public BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public Team() {

	}

	/**
	 * This constructs Team with teamName and creationDate
	 * 
	 * @param teamName
	 * @param creationDate
	 */

	public Team(String teamName, Date creationDate) {
		super();
		this.teamName = teamName;
		this.creationDate = creationDate;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	/**
	 * This method accepts teamName and initialize the Date object with current date
	 * and time of creation
	 * 
	 * @param service
	 * @throws IOException
	 */

	public void createTeam(Services service) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Team Name ");
		teamName = br.readLine();
		creationDate = new Date();

	}

	/**
	 * This method shows Player List according Team Name
	 * 
	 * @param tname
	 */
	public void showTeam(String tname) {

		// System.out.println("Team Name : " + teamName);
		// System.out.println("Date Of Creation : " + creationDate);

		for (Player p : players) {

			if (tname.equals(p.getPlayFor())) {
				teamPlayers.add(p.getName());
			}
		}

		for (String teamplayers : teamPlayers) {

			System.out.println(teamplayers);
		}

	}

	/**
	 * This method show total number of players players for the specific team it
	 * takes team name as parameter
	 * 
	 * @param teamName
	 */
	public void totalPlayersInTeam(String teamName) {
		int count = 0;
		for (Player p : players) {
			if (p.getPlayFor().equalsIgnoreCase(teamName)) {
				count++;
			}
		}
		System.out.println("Team name: " + teamName + " No of players present per Team :" + count);

	}

	public void addPlayerInTeam(String name, Services service) throws IOException {

		for (Player player : players) {

			if (player.getName().equals(name)) {
				System.out.println("Enter Team Name : ");
				String tname = br.readLine();
				if (service.checkTeamExistance(tname)) {

					player.setPlayFor(tname);
					System.out.println("Player is Added...");
				} else {
					System.out.println("Team does not Exist for team name " + tname);
				}

			}
		}

	}

	/**
	 * This method takes player name and removes it form team and initialize
	 * setPlayFor Undefined
	 * 
	 * @param pname
	 */
	public void removePlayerFromTeam(String pname) {

		for (Player player : players) {

			if (player.getName().equals(pname)) {
				System.out.println("Player name : " + player.getName());
				System.out.println("Team Name : " + player.getPlayFor());
				player.setPlayFor("Undefined");
				System.out.println("Updated Player Status : " + player.getPlayFor());
			}
		}
	}

	public void searchPlayerByName(String pname) {

		for (Player p : players) {

			if (p.getName().equalsIgnoreCase(pname)) {

				System.out.println("Player is Exist In System : " + p.getName() + " Plays for : " + p.getPlayFor());
				break;

			}
		}
	}

	public void teamPlayers(String tname) {

		Set<String> playerNameList = new TreeSet<String>();

		for (Player p : players) {

			String teamName = p.getPlayFor();
			if (teamName.equalsIgnoreCase(tname)) {
				playerNameList.add(p.getName());
			}

		}

		for (String name : playerNameList) {
			System.out.println(name);
		}

	}

	public void showTeamList() {

		for (String name : teamPlayers) {
			System.out.println(name);
		}
	}

}
