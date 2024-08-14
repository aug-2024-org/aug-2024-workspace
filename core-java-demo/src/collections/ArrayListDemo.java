package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		//ArrayList allCities = new ArrayList();
		
		List<String> allCities = new ArrayList<>();
		
		// C - Create
		allCities.add("Chennai");
		allCities.add("Mumbai");
		allCities.add("Kolkata");
		allCities.add("Delhi");
		
		// R - Read
		// 1.
		for(int i=0;i<allCities.size();i++) {
			System.out.println(allCities.get(i));
		}
		System.out.println("---------------------");
		for(String eachCity: allCities) {
			System.out.println(eachCity);
		}
		System.out.println("---------------------");
		Iterator<String> itr = allCities.iterator();
		while(itr.hasNext()) {
			String str = itr.next();
			System.out.println(str);
		}
		System.out.println("---------------------");
		allCities.forEach((eachCity)->System.out.println(eachCity));
		System.out.println("---------------------");

		
		// U - Update
		allCities.set(2, "Calcutta");
		allCities.forEach((eachCity)->System.out.println(eachCity));
		System.out.println("---------------------");

		// D - Delete
		allCities.remove(1);
		allCities.forEach((eachCity)->System.out.println(eachCity));
		
		Integer i1 = 10;
		i1.byteValue();
		Object o1 = 10;
		o1 = "hello";
	}

}
