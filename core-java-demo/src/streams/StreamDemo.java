package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		List<Integer> allNumbers = Arrays.asList(30, 70, 20, 80, 10, 5, 70, 90, 100);
		
		// count the elements in the collection
//		Stream stream = allNumbers.stream();
//		int theCount = (int)stream.count();
		long theCount = allNumbers.stream().count();
		System.out.println("Count is : " + theCount);
		
		// remove duplicate elements from allNumbers
		List<Integer> distinctNumbers = allNumbers.stream().distinct().collect(Collectors.toList());
		System.out.println(distinctNumbers);
		System.out.println("Count of ditinct numbers : " + distinctNumbers.stream().count());
		
		
		List<String> allCities = Arrays.asList("Chennai", "Mumbai", "Delhi", "Bangalore", "Trichy", "Madurai", "Chennai");
		// convert a collection of strings to upper case and print it on the console
		allCities.stream()
					.map((eachCity) -> eachCity.toUpperCase())
					.forEach((eachCity) -> System.out.println(eachCity));
		
		// convert a collection of strings to lowers case and store it in another collection
		Set<String> lowerCaseCity = allCities.stream()
					.map((eachCity) -> eachCity.toLowerCase())
					.collect(Collectors.toSet());
		System.out.println("Lower case cities : " + lowerCaseCity);
		
		// find the sum of all the numbers in allNumbers
//		int summedUp = allNumbers.stream().reduce(100, (eachNumber, sum) -> sum += eachNumber);
		int summedUp = allNumbers.stream().reduce((eachNumber, sum) -> sum += eachNumber).get();

		System.out.println("Sum is : " + summedUp);
		
		// find the sum of all the odd numbers
		int oddSum = allNumbers.stream()
								.filter((eachNumber) -> (eachNumber%2 != 0))
								.reduce((eachNumber, sum) -> sum += eachNumber).get();
		System.out.println("Odd Sum : " + oddSum);
		
		// find the largest number
		int maxValue = allNumbers.stream()
									.max((op1, op2) -> op1 - op2).get();
		System.out.println("Largest Number : " + maxValue);
		
		// find the smallest number
		int minValue = allNumbers.stream()
				.min((op1, op2) -> op1 - op2).get();
		System.out.println("Smallest Number : " + minValue);
		
		// sort the cities in ascending order
		List<String> sortedCities = allCities.stream()
												.sorted()
												.collect(Collectors.toList());
		System.out.println("Ascending : " + sortedCities);
		
		// sort the cities in descending
		List<String> sortedCities2 = allCities.stream()
													.sorted((op1, op2) -> op2.compareTo(op1))
													.collect(Collectors.toList());
		System.out.println("Descending : " + sortedCities2);
		
		
		// find the average of the numbers
		double average = allNumbers.stream()
									.mapToDouble((eachNumber) -> eachNumber.doubleValue())
									.average()
									.orElse(0.0);
		System.out.println("Average : " + average);
		
		// find the second smallest number
		int secondSmallest = allNumbers.stream()
											.sorted()
											.distinct()
											.skip(1)
											.findFirst()
											.get();
		System.out.println("Second smallest : " + secondSmallest);
		
		// find the second largest number
		int secondLargest = allNumbers.stream()
				.sorted((op1, op2) -> op2 - op1)
				.distinct()
				.skip(1)
				.findFirst()
				.get();
		System.out.println("Second largest : " + secondLargest);
	}

}
