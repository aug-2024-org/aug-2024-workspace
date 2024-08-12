package flowcontrol;

import java.util.Scanner;

public class Assignment3 {
	// Question 10
	public static void main(String[] args) {
		// input
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the grade : ");
		String grade = scan.next();
		
		// process
		String result = getMeaning(grade);
		
		// output
		System.out.println("Grade " + grade + " means " + result);
	}
	
	public static String getMeaning(String gradeInput) {
		String output = "Invalid";
		switch(gradeInput) {
			case "A" -> output = "Excellent";
			case "B" -> output = "Good";
			case "C" -> output = "Average";
			case "D" -> output = "Defficient";
			case "E", "F" -> output = "Failing";
		}
		return output;
	}
	
	
	
	

}
