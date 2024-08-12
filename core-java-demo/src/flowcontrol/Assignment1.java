package flowcontrol;

import java.util.Scanner;

public class Assignment1 {
	// question 6
	public static void main(String args[]) {
		// input
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first angle:");
		int angle1 = scan.nextInt();
		
		System.out.println("Enter second angle:");
		int angle2 = scan.nextInt();
		
		System.out.println("Enter third angle:");
		int angle3 = scan.nextInt();
		
		// process
		String result = validTriagle(angle1, angle2, angle3);
		
		// output
		System.out.println("Trianlge is :" + result);
	}
	
	public static String validTriagle(int ang1, int ang2, int ang3) {
		return ((ang1 + ang2 + ang3)==180)?"Valid":"Invalid";
	}
}
