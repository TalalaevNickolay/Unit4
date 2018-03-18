package by.htp.unit4;

public class main {

	public static void main(String[] args) {

		University bsuir = new University();

		Abiturient ab1 = new Abiturient("Ivan",9);
		Abiturient ab2 = new Abiturient("Petya",8);
		Abiturient ab3 = new Abiturient("Dasha",6);
		Abiturient ab4 = new Abiturient("Roma",10);
		Abiturient ab5 = new Abiturient("Kolya",5);
		Abiturient ab6 = new Abiturient("Lilo",4);

		University.setPlaces(5);
		
		bsuir .setAbiturients(Abiturient.toList(ab1,ab2,ab3,ab4,ab5,ab6));
		bsuir.otsev(University.getPlaces());
		

	}

}

