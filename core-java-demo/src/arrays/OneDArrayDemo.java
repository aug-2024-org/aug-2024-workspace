package arrays;

public class OneDArrayDemo {

	public static void main(String[] args) {
		int mark = 50;
		System.out.println(mark);
		System.out.println("--------------");
		
		int[] myMarks = new int[6];
		myMarks[0] = 40;
		myMarks[1] = 50;
		myMarks[2] = 60;
		myMarks[3] = 70;
		myMarks[4] = 80;
		myMarks[5] = 90;
		
		//myMarks[9] = 50;
	
		for(int i=0;i<myMarks.length;i++) {
			System.out.println(myMarks[i]);
		}
		System.out.println("---------------");
		
		for(int eachMark: myMarks) {
			System.out.println(eachMark);
		}
		
		Object obj = myMarks;
		
		// array initialization
		int[] allMarks = {80,20,50,30};
		
		
		
	}

}
