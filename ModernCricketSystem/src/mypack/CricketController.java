package mypack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * This class Controls overall operations of Teams and Players
 * @author priyankaku
 * @version 0.2
 */
public class CricketController {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws NumberFormatException, IOException {
		int e = 0;
		Services service = new Services();
		Team team=new Team();
		System.out.println("******************* Modern Cricket System ********************");
		do {
			System.out.println("Press 1  Team :");
			System.out.println("Press 2  Player :");
			System.out.println("Press 3  To Play Match :");
			System.out.println("Press 4 to Exit from System : ");
			System.out.println("******************************************");
			int choice = Integer.parseInt(br.readLine());
			switch (choice) {

			case 1:
				System.out.println("Press 1 to Create Team : ");
				System.out.println("Press 2 to Show Total Teams In System : ");
				System.out.println("Press 3 to Show Sorted Team By Team Date Creation : ");
				System.out.println("Press 4 to Show Players list Team Wise : ");
				System.out.println("Press 5 to Search Team : ");
				System.out.println("Press 6 to See total players In Team :");
				System.out.println("Press Any Key to Come Back To Main Case : ");

				int choiceTeam = Integer.parseInt(br.readLine());

				switch (choiceTeam) {

				case 1:
					team.createTeam(service);
					service.teamList.add(new Team(team.getTeamName(),team.getCreationDate())); // team added in system
					System.out.println("Team is added In System");
					service.totalTeamsInSystem();
					System.out.println("******************************************");
					break;
				case 2:
					 service.totalTeamsInSystem();  // team list by name
					System.out.println("******************************************");
					break;
				case 3:
					service.sortTeamByDate(); // sort team by date
					System.out.println("******************************************");
					break;
				case 4:

					System.out.println("Enter Team name To Search Team players ");
					String tname = br.readLine();
					team.teamPlayers(tname); 
					System.out.println("******************************************");
					break;
				case 5:
					System.out.println("Enter Team name To Search Team"); // search team
					String tname1 = br.readLine();
					service.searchTeamByName(tname1);
					System.out.println("******************************************");
					break;
					
				case 6:
					System.out.println("Enter Team name To see how many Players in Team : "); // total no of players in specific team 
					String teamname = br.readLine();
					team.totalPlayersInTeam(teamname); 
					break;

				default:
					break;

				}

				break;

			case 2:
				System.out.println("Press 1 to Create Player : ");
				System.out.println("Press 2 to Add Player In Team : ");
				System.out.println("Press 3 to Search Player :");
				System.out.println("Press 4 to Remove Player From Team : ");
				System.out.println("Press Any Key to Come Back To Main Case : ");

				int playerChoice = Integer.parseInt(br.readLine());
				switch (playerChoice) {

				case 1:
					Player p = new Player();
					p.createPlayer(service);
					//service.playerList.add(p);
					team.players.add(new Player(p.getName()));  // add player
					System.out.println("Player is added In System");
					System.out.println("******************************************");
					break;
				case 2:
					System.out.println("Enter Player Name to add in Team"); // add player to team
					String pname = br.readLine();
					team.addPlayerInTeam(pname, service);
					System.out.println("******************************************");
					break;
				case 3:
					System.out.println("Enter Player Name To Search : "); // search player
					String pname1 = br.readLine();
					team.searchPlayerByName(pname1);
					System.out.println("******************************************");
					break;
				case 4:
					System.out.println("Enter Player Name To Remove : "); // remove player from team
					String pname2 = br.readLine();
					team.removePlayerFromTeam(pname2);

					System.out.println("******************************************");
					break;
				default:
					break;

				}

				break;
			case 3:
				System.out.println("Press 1 To Play Match : ");
				System.out.println("Press 2 To Show Match Details : ");
				System.out.println("Press Any Key to Come Back To Main Case : ");
				int matchChoice = Integer.parseInt(br.readLine());
				switch (matchChoice) {
				case 1:
					// PlayMatch
					Match m = new Match();
					m.playMatch(service);
					System.out.println("******************************************");
					break;
				case 2:
					// show match details
					service.showMatchdetails();
					System.out.println("******************************************");
					break;
				default:
					break;
				}

			case 4:
				e = 10;
				System.out.println("Thanks for using our System ....");
				break;
				
			default:
				break;

			}
		} while (e != 10);

	}

}
