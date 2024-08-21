package multithreading;

public class PrintRequestThread implements Runnable{
	Thread t;
	PrinterResource printer;
	String message;
	
	public PrintRequestThread(String name, PrinterResource printer, String message) {
		t = new Thread(this);
		t.setName(name);
		this.printer = printer;
		this.message = message;
		t.start();
	}
	
	@Override
	public void run() {
		synchronized(printer) {
			printer.print(message);	
		}
			
	}
}
