package flowcontrol;

import java.util.Scanner;

public class Assignment2 {
	// Question 8
	public static void main(String[] args) {
		//input
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no. of calls:");
		int noOfCalls = scan.nextInt();
		
		//process
		double result = calculateCost(noOfCalls);
		
		//output
		System.out.println("Bill for " + noOfCalls + " is Rs." + result);
	}
	
	public static double calculateCost(int calls) {
		double output = 0.0;
		if(calls >= 0 && calls <= 100) {
			output = 200;
		} else if(calls > 100 && calls <= 150) {
			output = 200 + ((calls - 100) * 0.60);
		} else if(calls > 150 && calls <= 200) {
			output = 200 + ((calls - 100) * 0.50);
		} else if(calls >200) {
			output = 200 + ((calls - 100) * 0.40);
		}
		
		return output;
	}
}
