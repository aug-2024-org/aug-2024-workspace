package collections;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

import classesandobjects.Room;

public class TreeSetDemo {

	public static void main(String[] args) {
//		SortedSet<String> allCountries = new TreeSet<>();
		SortedSet<String> allCountries = new TreeSet<>((obj1, obj2) -> obj2.compareTo(obj1));

		
		// C - Create
		allCountries.add("India");
		allCountries.add("China");
		allCountries.add("Sri Lanka");
		allCountries.add("Pakistan");
		allCountries.add("Bangladesh");
		allCountries.add("Myanmar");
		allCountries.add("Nepal");
		allCountries.add("China"); // duplicate
		
		// R - Read
		for(String eachCountry: allCountries) {
			System.out.println(eachCountry);
		}
		System.out.println("----------------------");
		Iterator itr = allCountries.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("----------------------");
		allCountries.forEach((eachCountry)->System.out.println(eachCountry));
		System.out.println("----------------------");

		// U - Update and D - Delete
		allCountries.remove("Sri Lanka");
		allCountries.add("Srilanka");
		allCountries.forEach((eachCountry)->System.out.println(eachCountry));
		System.out.println("----------------------");
		
		
		SortedSet<Integer> allNumbers = new TreeSet<>((obj1, obj2) -> obj2 - obj1);
		allNumbers.add(59);
		allNumbers.add(20);
		allNumbers.add(35);
		allNumbers.add(10);
		
		allNumbers.forEach((eachNumber)->System.out.println(eachNumber));
		System.out.println("----------------------");
	
		SortedSet<Room> allRooms = new TreeSet<>();
		allRooms.add(new Room(200, 100, 50));
		allRooms.add(new Room(100, 80, 50));
		allRooms.add(new Room(800, 300, 50));
		allRooms.add(new Room(100, 80, 50)); // duplicate
		allRooms.add(new Room(250, 150, 50));
		
		allRooms.forEach((eachRoom)-> System.out.println(eachRoom));
		
	}

}
