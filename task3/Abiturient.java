package by.htp.unit4;

import java.util.ArrayList;


public class Abiturient {

	private String name;
	private int mark;

	public Abiturient(String name, int mark){
		this.name = name;
		this.mark = mark;
	}

	@Override   
	public String toString(){
		return getClass().getName() + " @ " +"name:" + name + "; mark:" + mark;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	public static ArrayList<Abiturient> toList(Abiturient ... abiturients){
		
		ArrayList<Abiturient> list = new ArrayList<Abiturient>();
		for(Abiturient n : abiturients){
			list.add(n);
		}
		
		return list;
	}

}
