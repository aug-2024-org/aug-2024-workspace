package multithreading;

public class PriorityThreadDemo {

	public static void main(String[] args) {
		ChildPriorityThread pt1 = new ChildPriorityThread("child1", Thread.MIN_PRIORITY);
		ChildPriorityThread pt2 = new ChildPriorityThread("child2", Thread.MAX_PRIORITY);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		pt1.t.stop(); // deprecated, don't use it, used it just to show thread priorities
		pt2.t.stop(); // deprecated, don't use it

		System.out.println(pt1.t.getName() + " counter : " + pt1.counter);
		System.out.println(pt2.t.getName() + " counter : " + pt2.counter);
	}

}
