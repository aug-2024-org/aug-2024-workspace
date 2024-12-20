package multithreading;

public class OtherChildThread implements Runnable{
	Thread t;
	
	public OtherChildThread(String name) {
		t = new Thread(this);
		t.setName(name);
	}
	
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(t.getName() + " : " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(t.getName() + " : over...");
	}

}
