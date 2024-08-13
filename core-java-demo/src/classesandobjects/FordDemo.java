package classesandobjects;

public class FordDemo {

	public static void main(String[] args) {
		FordFigo figo1 = new FordFigo("FIGO", "Silver", 4);
		System.out.println(figo1.unlock());
		System.out.println(figo1.start());
		System.out.println(figo1.accelerate());
		System.out.println(figo1.applyBrake());
		System.out.println(figo1.stop());
		System.out.println(figo1.lock());
		System.out.println("----------------------------------");
		
		FordFigoTitanium tita1 = new FordFigoTitanium("TITANIUM", "White", 4, 2);
		System.out.println(tita1.unlock());
		System.out.println(tita1.start());
		System.out.println(tita1.accelerate());
		System.out.println(tita1.applyBrake());
		System.out.println(tita1.ejectAirbags());
		System.out.println(tita1.stop());
		System.out.println(tita1.lock());
	}

}
