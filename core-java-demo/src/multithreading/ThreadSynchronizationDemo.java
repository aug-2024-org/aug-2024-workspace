package multithreading;
// further topics to learn
// 1. inter thread communication
// 2. executor framework for threads

public class ThreadSynchronizationDemo {
	// expected output
	// [hello]
	// [welcome]
	// [java]
	public static void main(String[] args) {
		PrinterResource printer = new PrinterResource();
		PrintRequestThread pt1 = new PrintRequestThread("request1", printer, "hello");
		PrintRequestThread pt2 = new PrintRequestThread("request2", printer, "welcome");
		PrintRequestThread pt3 = new PrintRequestThread("request3", printer, "java");
		
		try {
			pt1.t.join();
			pt2.t.join();
			pt3.t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Main over...");
	}

}
