package multithreading;

public class MainThreadDemo {

	// 2 ways to create a thread
	// 1) create a class and extend Thread class 
	// 2) create a class and implement Runnable interface
	
	
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		
		System.out.println("Thread name : " + t.getName());
		System.out.println("Thread id : " + t.getId());
		System.out.println("Thread Priority : " + t.getPriority());
		System.out.println("Thread state : " + t.getState());
		System.out.println("Thread group : " + t.getThreadGroup());
		System.out.println("Thread is alive ? " + t.isAlive());
		System.out.println("Thread is daemon ? " + t.isDaemon());

		ChildThread child1 = new ChildThread("ChildOne"); // this does not create the child thread at OS level
		//child1.run(); //  by calling run() it executes as a part of the current thread which is main thread, so don't do this
		child1.start(); // it is important to call the start() method on the child thread object 
								//so that the thread gets created at OS level
								// the start() will in turn call the run() method
		
		OtherChildThread child2 = new OtherChildThread("ChildTwo");
		child2.t.start();
		
		for(int i=1;i<=5;i++) {
			System.out.println(t.getName() + " : " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			child1.join();
			child2.t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Main thread over...");
	}

}
