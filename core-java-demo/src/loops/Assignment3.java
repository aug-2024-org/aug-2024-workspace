package loops;

import java.util.Scanner;

public class Assignment3 {
	// Question 17
	public static void main(String[] args) {
		int randomNumber = (int)(Math.random() * 100);
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("Guess the number :");
			int numGuess  = scan.nextInt();

			if(numGuess > randomNumber) {
				System.out.println("Too high!");
			}else if(numGuess < randomNumber){
				System.out.println("Too low!");
			}else {
				System.out.println("Guessed the number : " + randomNumber);
				break;
			}
		}
	}

}
