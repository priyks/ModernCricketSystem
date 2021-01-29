package mypack;

import java.util.Comparator;

public class SortTeamByDateComparator implements Comparator <Team>{

	@Override
	public int compare(Team o1, Team o2) {
		// TODO Auto-generated method stub
		
		return o1.getCreationDate().compareTo(o2.getCreationDate());
	}

}
