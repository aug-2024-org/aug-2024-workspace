package loops;

import java.util.Scanner;

public class Assignment1 {
	// Question 9
	public static void main(String[] args) {
		// input
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first number :");
		int num1 = scan.nextInt();
		
		System.out.println("Enter second number :");
		int num2 = scan.nextInt();
		// process
		int result = findHCF(num1, num2);
		// output
		System.out.println("HCF of " + num1 + " and " + num2 + " is " + result);
	}
	
	public static int findHCF(int num1, int num2 ) {
		int output = 1;
		for(int i=1; i<=((num1<num2)?num1:num2); i++) {
			if((num1 % i == 0) && (num2 % i == 0)) {
				output *= i;
				num1 /= i;
				num2 /= i;
			}
		}
		return output;
	}

}
