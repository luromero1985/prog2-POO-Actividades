package final_5_9_24;

import java.util.Comparator;

public class ComparadorUrl implements Comparator<Marcador>{
	
	
	public int compare(Marcador c1, Marcador c2) {
		
		return c1.getUrl().compareTo(c2.getUrl());
		
	}

}
