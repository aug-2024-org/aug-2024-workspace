package exceptionhandling;

import classesandobjects.Room;

public class ExceptionHandling4 {

	public static void main(String[] args) {
		try {
			method1();
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void method1() {
		method2();
	}
	
	public static void method2() {
		method3();
	}
	
	public static void method3() {
		// some code
		// unchecked exceptions 
		// 	- they are not enforced by compiler
		//checked exceptions
		// 	- compiler is very particular that this category of exceptions have to be handled
		int[] arr = new int[5];
		System.out.println(arr[10]);	
		//FileReader read = new FileReader("Sample.txt");
		
		Room r1 = null;
		if(r1 != null)
			r1.setHeight(100);
		
	}
	

}
