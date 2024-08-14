package generics;

public class BoxDemo {

	public static void main(String[] args) {
		Box box1 = new Box(5,3,2);
		System.out.println("box1 : " + box1);
		
//		Box box2 = new Box(9.4, 7.2, 2.2);
//		System.out.println("box2 : " + box2);
		
		
		BoxGenerics<Integer, Float> box3 = new BoxGenerics<Integer,Float>(7,4,2.5f);
		System.out.println("box3 : " + box3);
		
		BoxGenerics<Float, Double> box4 = new BoxGenerics<>(7.5f, 3.3f, 2.5);
		System.out.println("box4 : " + box4);
	}

}
