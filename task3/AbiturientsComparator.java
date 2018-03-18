package by.htp.unit4;

import java.util.Comparator;

public class AbiturientsComparator implements Comparator<Abiturient>{
	
	@Override
	public int compare(Abiturient arg1, Abiturient arg2) {
				
		if(arg1.getMark()>arg2.getMark()){
			return -1;
		}
		
		if(arg1.getMark()<arg2.getMark()){
			return 1;
		}
		return 1;
	}
}
