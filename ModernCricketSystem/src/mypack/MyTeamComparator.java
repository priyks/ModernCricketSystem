package mypack;

import java.util.Comparator;

public class MyTeamComparator implements Comparator<Team> {

	@Override
	public int compare(Team o1, Team o2) {
		
		
		return o1.getTeamName().compareTo(o2.getTeamName());
	}
	
	

}
