package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import classesandobjects.Room;

public class HashSetDemo {
	public static void main(String[] srgs) {
		Set<String> allCities = new HashSet<>();
		
		// C - Create
		allCities.add("Chennai");
		allCities.add("Mumbai");
		allCities.add("Pune");
		allCities.add("Kolkatta");
		allCities.add("Chennai");
		
		// R - Read
		for(String eachCity: allCities) {
			System.out.println(eachCity);
		}
		System.out.println("--------------");
		Iterator<String> itr = allCities.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("--------------");
		allCities.forEach((eachCity) -> System.out.println(eachCity));
	
		System.out.println("--------------");
		
		// U - Update, D - Delete
		allCities.remove("Kolkatta");
		allCities.add("Calcutta");
		allCities.forEach((eachCity) -> System.out.println(eachCity));
		
		System.out.println("--------------");
		
		Set<Room> allRooms = new HashSet<>();
		allRooms.add(new Room(200, 100, 50));
		allRooms.add(new Room(100, 80, 50));
		allRooms.add(new Room(800, 300, 50));
		allRooms.add(new Room(100, 80, 50)); // duplicate
		allRooms.add(new Room(250, 150, 50));
		
		allRooms.forEach((eachRoom)-> System.out.println(eachRoom));
		
		
	}
}
