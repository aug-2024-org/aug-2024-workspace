package exceptionhandling;

public class CustomExceptionDemo {

	public static void main(String[] args){
		int opt = 8;
		
		try {
			if(opt > 5) {
				InvalidOptionException ioe = new InvalidOptionException(opt);
				throw ioe;
			}
		}catch(InvalidOptionException i) {
			System.out.println(i.getMessage());
		}
		System.out.println("Over!");
		
	}

}
