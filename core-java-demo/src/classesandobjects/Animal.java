package classesandobjects;

public class Animal {
	String name;
	
	Animal(String name){
		this.name = name;
	}
	
	void breathe() {
		System.out.println(name + " is breathing");
	}
	
	void mobile() {
		System.out.println(name + " is mobile");
	}

}
