package multithreading;

public class ChildThread extends Thread{

	public ChildThread(String name) {
		setName(name);
	}
	
	@Override
	public void run() {
		//Thread t = Thread.currentThread();
		// here we write the body/code of the child thread
		for(int i=1;i<=5;i++) {
			System.out.println(getName() + " : " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(getName() + " : over...");
	}
}
