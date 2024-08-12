package loops;

import java.util.ArrayList;
import java.util.List;

public class Assignment2 {
	// Question 13
	public static void main(String args[]) {
		// input
		int endValue = 500;
		
		// process
		List<Integer> result = getArmstrong(endValue);
		
		// output
		System.out.println("List of Armstrong numbers : " + result);
	}
	
	public static List<Integer> getArmstrong(int endValue){
		List<Integer> allNumbers = new ArrayList<>();
		
		for(int i=1; i<endValue; i++) {
			int number = i;
			int sum = 0;
			while(number > 0) {
				int lastDigit = number % 10;
				sum = (int)(sum + Math.pow(lastDigit, 3));
				number /= 10;
			}
			if(i == sum) {
				allNumbers.add(i);
			}
		}
		return allNumbers;
	}
}
