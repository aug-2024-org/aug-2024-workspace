
public class OperatosDemo {
	// Arithmetic operators - + - * / %
	// Logical Operators - &&  ||  !
	// Relational Operator - < <= > >= != ==
	// Assignment Operator - =
	// Arithmetic Assignment Operator - += -= /= *= %=
	// Bitwise Operators - & | ! << >> >>>
	
	// Unary Operators - + - ++ --
	// Binary Operators 
	// Ternary Operators - ?:
	
	public static void main(String[] args) {
		
		final int MIN_AGE = 18;
		//MIN_AGE = 21;
		
		
		int num1 = 50;
		int num2 = 60;
		int largestNum = (num1>num2)?num1:num2;
		System.out.println("Largest of " + num1 + " and " + num2 + " is " + largestNum);

		String result = (num1%2==0)?"Even":"Odd";
		System.out.println(num1 + " is " + result);
		
		int result1 = 5>>2;
		System.out.println(result1);
		
		int result2 = 5<<2;
		System.out.println(result2);
		
		int result3 = 5&3;
		System.out.println(result3);
		
	}

}
