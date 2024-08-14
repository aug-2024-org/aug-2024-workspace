package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<String, Integer> phoneBook = new HashMap<>();
		
		// C - Create
		phoneBook.put("Will Smith", 1234588);
		phoneBook.put("Brad Pitt", 1234444);
		phoneBook.put("Angelina Jolie", 8888588);
		phoneBook.put("Gautam", 1234588);
		
		// R - Read
		Set<String> allNames = phoneBook.keySet();
		for(String eachName: allNames) {
			System.out.println(eachName + " : " + phoneBook.get(eachName));
		}
		System.out.println("------------------");
		
		// U - Update
		phoneBook.replace("Will Smith", 8888888);
		Set<String> allNames1 = phoneBook.keySet();
		for(String eachName: allNames1) {
			System.out.println(eachName + " : " + phoneBook.get(eachName));
		}
		System.out.println("------------------");
	
		// D - Delete
		phoneBook.remove("Will Smith");
		Set<String> allNames2 = phoneBook.keySet();
		for(String eachName: allNames2) {
			System.out.println(eachName + " : " + phoneBook.get(eachName));
		}
		System.out.println("------------------");
	}

}
