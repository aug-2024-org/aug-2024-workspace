package filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) {
		char[] charData = new char[100];
		try {
			FileReader fr = new FileReader("test.txt");
			fr.read(charData);
			String str = new String(charData);
			System.out.println("Read Data : " + str);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
