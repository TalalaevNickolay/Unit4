package by.htp.unit4;

public class Group {

	public static void main(String[] args) {
		Student st1 = new Student("Ivan","Petrov",9,8,7,2);
		Student st2 = new Student("Lolic","Bolikov",6,6,5,4);
		System.out.println("Средний балл студента " + st1.getName() + " " + st1.getSurname() + " " + averageMark(st1));
		System.out.println("Средний балл студента " + st2.getName() + " " + st2.getSurname() + " " + averageMark(st2));
		System.out.println("Средний балл группы " + averageGroupMark(st1, st2));
		
	}
	public static double averageMark(Student student){
		
		double average;
		average = (student.math + student.english + student.physics + student.oop)/4;
		return average;
	}
	public static double averageGroupMark(Student ...students){
		
		double average;
		double temp = 0;
		for(Student i : students){
			temp+=i.math + i.english + i.physics + i.oop;
		}
		average = temp / (4 * students.length);
		return average;
	}

}
