package classesandobjects;

public abstract class Animal {
	String name;
	
	Animal(String name){
		this.name = name;
	}
	
	void breathe() {
		System.out.println(name + " is breathing");
	}
	
	 abstract void mobile();

}
