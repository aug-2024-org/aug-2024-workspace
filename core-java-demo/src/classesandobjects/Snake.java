package classesandobjects;

public class Snake extends Animal{
	
	Snake(String name){
		super(name);
	}
	
	@Override
	void mobile() {
		System.out.println(name + " crawls...");
	}
	
	void attacks() {
		System.out.println(name + " bites...");
	}

}
