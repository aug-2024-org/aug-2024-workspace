package lambdas;

import java.util.function.BiFunction;
import java.util.function.IntBinaryOperator;

public class Demo {

	public static void main(String[] args) {
		// ways to implement functional interface
		// first way - conventional way
		Operation add1 = new Addition();
		System.out.println("Addition - Conventional way : " + add1.operate(4, 6));
		
		Operation product1 = new Multiplication();
		System.out.println("Multiplication - Conventional way : " + product1.operate(4, 6));
		
		// second way - anonymous classes(classes with no name)
		Operation add2 = new Operation() {
			@Override
			public int operate(int num1, int num2) {
				return (num1 + num2);
			}
		};
		System.out.println("Addition - Anonymous class way : " + add2.operate(10, 60));
		
		Operation product2 = new Operation() {
			@Override
			public int operate(int num1, int num2) {
				return (num1 * num2);
			}
		};
		System.out.println("Multiplication - Anonymous class way : " + product2.operate(10, 60));
		
		// third way - lambda expressions
		Operation add3 = (num1, num2) -> (num1 + num2);
		System.out.println("Addition - Lambda expression way : " + add3.operate(1, 6));
		
		Operation product3 = (num1, num2) -> (num1 * num2);
		System.out.println("Multiplication - Lambda expression way : " + product3.operate(1, 6));
		
		
		BiFunction<Integer, Integer, Integer> add4 = (num1, num2) -> (num1 + num2);
		System.out.println("Addition - using inbuilt functional interfaces : " + add4.apply(20, 30));
		
		IntBinaryOperator add5 = (num1, num2) -> (num1 + num2);
		System.out.println("Addition - using inbuilt functional interfaces : " + add5.applyAsInt(70, 30));
	}

}
