package by.htp.unit4;

import java.util.ArrayList;
import java.util.TreeSet;

public class University {

	private ArrayList<Abiturient> abiturients;
	private static int places = 3;

	private AbiturientsComparator comparator = new AbiturientsComparator();
	private TreeSet<Abiturient> assorted = new TreeSet<Abiturient>(comparator);

	public  static void print(ArrayList<Abiturient> abitur){

		for(Abiturient n : abitur){
			System.out.println(n.toString());
		}
	}

	public void otsev (int places) {

		int count=0;

		for (Abiturient n: getAbiturients()) {
			assorted.add(n);
		}

		for (Abiturient n: assorted){
			count++;
			if (count<=places) {

				System.out.println(" - "+n.getName()+" . Его оценка "+n.getMark());
			}

		}
	}

	public ArrayList<Abiturient> getAbiturients() {
		return abiturients;
	}

	public static int getPlaces() {
		return places;
	}

	public static void setPlaces(int places) {
		University.places = places;
	}

	public void setAbiturients(ArrayList<Abiturient> abiturients) {
		this.abiturients = abiturients;
	}

	}
