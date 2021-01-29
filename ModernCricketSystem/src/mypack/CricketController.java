package mypack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CricketController {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws NumberFormatException, IOException {
		int e = 0;
		Services service = new Services();
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
					System.out.println("Press 2 to Show Sorted Team By Team Name : ");
					System.out.println("Press 3 to Show Sorted Team By Team Date Creation : ");
					System.out.println("Press 4 to Show Players list Team Wise : ");
					System.out.println("Press 5 to Search Team : ");
					System.out.println("Press Any Key to Come Back To Main Case : ");
					
					int choiceTeam=Integer.parseInt(br.readLine());
					
					switch(choiceTeam) {
					   
					case 1: 
						Team t = new Team();
						t.createTeam(service);
						service.teamList.add(t); // team added in system
						System.out.println("Team is added In System");
						service.totalTeamsInSystem();
						System.out.println("******************************************");
						break;
					case 2:
						service.sortTeamByName(); // sort team by name
						System.out.println("******************************************");
						break;
					case 3:
						service.sortTeamByDate();  	// sort team by date
						System.out.println("******************************************");
						break;
					case 4:
						
						System.out.println("Enter Team name To Search Team");
						String tname = br.readLine();
						service.sortTeamPlayersByName(tname);
						System.out.println("******************************************");
						break;
					case 5:
						System.out.println("Enter Team Name to Search Team In System : "); 	// search team
						System.out.println("Enter Team name To Search Team");
						String tname1 = br.readLine();
						service.searchTeamByName(tname1);
						System.out.println("******************************************");
						break;
						
						default :
							break;	
						
					}
					
                  break;
                  
			case 2:
				     System.out.println("Press 1 to Create Player : ");
				     System.out.println("Press 2 to Add Player In Team : ");
				     System.out.println("Press 3 to Search Player :");
				     System.out.println("Press 4 to Remove Player From Team : ");
				     System.out.println("Press Any Key to Come Back To Main Case : ");
				     
				     int playerChoice=Integer.parseInt(br.readLine());
				     switch(playerChoice) {
				     
				     case 1: 
					    	Player p = new Player();
					 		p.createPlayer(service);
					 		service.playerList.add(p); 	// add player
					 		System.out.println("Player is added In System");
					 		System.out.println("******************************************");
					 		break;
				     case 2: 
				    		System.out.println("Enter Player Name to add in Team");   // add player to team
				    		String pname = br.readLine();
				    		service.addPlayerInTeam(pname);
				    		System.out.println("******************************************");
				    		break;
				     case 3:
					    	 System.out.println("Enter Player Name To Search : ");  // search player
					    	 String pname1 = br.readLine();
					    	 service.searchPlayerByName(pname1);
					    	 System.out.println("******************************************");
					    	 break;
				     case 4: 
					    	 System.out.println("Enter Player Name To Remove : "); 	// remove player from team
					    	 String pname2 = br.readLine();
					 		 service.removePlayerFromTeam(pname2);
				    	 
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
				   int matchChoice=Integer.parseInt(br.readLine());
				   switch(matchChoice)
				   {
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
				e=10;
				System.out.println("Thanks for using our System ....");
				break;
		    		
			}
		} while (e != 10);

	}

}
