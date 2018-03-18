package by.htp.unit4;

import java.util.ArrayList;

public class NoteBook {

	private String ownerName;

	private ArrayList<Note> notes;


	public NoteBook(String ownerName){
		this.ownerName = ownerName;

		notes = new ArrayList<Note>();
	}

	public void add(String text,int year, int month, int day){

		Note newNote= new Note(text, new Date(year, month, day), true);
		notes.add(newNote);
	}

	public void findNote(String text){

		for (Note n : notes) {
			if (n.toString().contains(text)){
				System.out.println(n.toString()); 	
			}
		}

	}

	public void findNote(int day,int month,int year){
		Date date = new Date(day,month,year);
		for(Note n : notes){
			if(date.equals(n.getDate())){
				System.out.println(n.toString());
			}

		}
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public void remove(String text,int day, int month, int year){
		Date date = new Date(day,month,year);
		for (Note n : notes) {
			if (n.toString().contains(text) || date.equals(n.getDate())){
				notes.remove(n);
			}

		}
		
	}
	public void print(/*NoteBook notebook*/){
		for (Note n : this.notes) {

			System.out.println("Note [text:" + n.getText() + "; " + n.getDate() + "; isActual="
					+ n.isActual() + "]");	
		}
	}
}
