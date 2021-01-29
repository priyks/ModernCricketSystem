package mypack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.Date;

public class Team  {

	private String teamName;
	private Date creationDate;

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
	
	public void createTeam(Services service) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Team Name ");
		teamName=br.readLine();
		creationDate=new Date();
		
		
	}
	
	public void showTeam() {

		System.out.println("Team Name : "+teamName);
		System.out.println("Date Of Creation : "+creationDate);
		
	}

	

	

}
