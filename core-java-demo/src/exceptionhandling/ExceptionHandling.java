package exceptionhandling;

public class ExceptionHandling {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 0;
		int c = 0;
		
		System.out.println("Going to divide...");
		c = a / b; // 1. JVM will identify that an exception has occured
					// 2. JVM will create an object of that exception type
					// 3. JVM will throw that exception object
					// 4. since there is no handler, the object goes to the default handler
					// 5. the default displays the exception message
					// 6. then the control never comes back to your program
		System.out.println("Answer is : " + c);
		System.out.println("Division is over...");
	}
}
