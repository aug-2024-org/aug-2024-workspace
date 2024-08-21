package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) {
		String data = "This is a sentence writtern to the file...";
		
		try {
			FileWriter fw = new FileWriter("test.txt");
			fw.write(data);
			fw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("data writtern to the file...");
	}

}
