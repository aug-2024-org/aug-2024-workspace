package exceptionhandling;

public class ExceptionHandling3 {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 0;
		int c = 0;
		
		System.out.println("Going to divide...");
		try {
			ArithmeticException ae  = new ArithmeticException();
			throw ae;
		}catch(ArithmeticException aexp) {
			System.out.println(aexp.getMessage());
		}
		System.out.println("Answer is : " + c);
		System.out.println("Division is over...");
	}
}
