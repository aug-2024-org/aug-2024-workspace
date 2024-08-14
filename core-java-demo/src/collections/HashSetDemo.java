package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

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
		
		
	}
}
