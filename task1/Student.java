package by.htp.unit4;

public class Student {

	String name;
	String surname;
	double math;
	double physics;
	double english;
	double oop;
	
	public Student(String name, String surname, double math, double physics, double english, double oop){
		
		this.name = name;
		this.surname = surname;
		this.math = math;
		this.physics = physics;
		this.english = english;
		this.oop = oop;
		
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	
}
