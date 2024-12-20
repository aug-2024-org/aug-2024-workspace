import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Frequency {

	
	/*
	 * Given an array of N elements, sort the elements of the array 
	 * based on frequency. If two numbers have the same frequency,then the smaller number 
	 * comes first (eg) if the elements are 1,1,3,1,2,3,4 then the output is 2,4,3,3,1,1,1
 
		Input Description:
		Size of the array followed by the number of elements
		Output Description:
		Array elements sorted based on increasing frequency
		Sample Input :
		5
		8 8 1 1 3
		Sample Output :
		3 1 1 8 8
	 */
	
			// 10
			// [4,6,8,2,6,8,1,3,9,6]
			
			// expected output
			// [1,2,3,4,9,8,8,6,6,6]
	public static void main(String[] args) {
		// input
		int[] input = {4,6,8,2,6,8,1,3,9,6};
		
		// process
		Map<Integer, Integer> frequencyMap = new HashMap<Integer, Integer>();
		for(int eachInput: input) {
			if(frequencyMap.containsKey(eachInput)) {
				// increment the value
				int value = frequencyMap.get(eachInput);
				frequencyMap.replace(eachInput, ++value);
			}else {
				// put a new key/value pair
				frequencyMap.put(eachInput, 1);
			}
		}
		System.out.println(frequencyMap); // debug
		List<Map.Entry<Integer,Integer>> sortedValfreqMap = sortValue(frequencyMap);
		System.out.println(sortedValfreqMap); // debug
		
		List<Integer> finalList = new ArrayList<Integer>();
		for(Map.Entry<Integer,Integer> eachEntrySet: sortedValfreqMap) {
			for(int i=0;i<eachEntrySet.getValue();i++) {
				finalList.add(eachEntrySet.getKey());
			}
		}
		// output
		System.out.println(finalList);
	}
	
	public static List<Map.Entry<Integer,Integer>> sortValue(Map<Integer, Integer> freqMap){
		// copy a set into a list
		List<Map.Entry<Integer,Integer>> entryList = 
				new LinkedList<Map.Entry<Integer,Integer>>(freqMap.entrySet());
		Collections.sort(entryList, (o1, o2)-> o1.getValue() - o2.getValue());
		System.out.println(entryList);
		// now copy the list back into a hashmap
//		Map<Integer, Integer> sortedValfreqMap = new HashMap<Integer, Integer>();
//		for(Map.Entry<Integer, Integer> eachEntry: entryList) {
//			sortedValfreqMap.put(eachEntry.getKey(), eachEntry.getValue());
//		}
		//return sortedValfreqMap;
		return entryList;
	}
}
