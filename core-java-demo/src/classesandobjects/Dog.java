package classesandobjects;

public class Dog extends Animal{
	String leashColor;
	
	Dog(String name, String leashColor){
		super(name);
		this.leashColor = leashColor;
	}

	@Override
	void mobile() {
		super.mobile();
		System.out.println(name + " walks on 4 legs");
	}
	
	void friendly() {
		System.out.println(name + " is friendly");
	}

}
