package exceptionhandling;

// try, catch, finally, throw, throws
public class ExceptionHandling2 {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 0;
		int c = 0;
		
		System.out.println("Going to divide...");
		try {
			c = a / b; //1. JVM will identify that an exception has occured
			// 2. JVM will create an object of that exception type
			// 3. JVM will throw that exception object
			// 4. since we have a handler catch block, it will be handled in the program
			System.out.println("Just divided...");
		}catch (ArithmeticException ae) {
			System.out.println("Sorry, not able to divide by 0");
			b = 1;
			c = a / b;
			System.out.println(ae.getMessage());
		}catch(ArrayIndexOutOfBoundsException aie) {
			System.out.println(aie.getMessage());
		}finally {
			// close the resources that were opened in the try block
			// try the new syntax called try with resources 
					//where the finally block is not required
		}
		
		System.out.println("Answer is : " + c);
		System.out.println("Division is over...");
	}
}
