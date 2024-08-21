package filehandling;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	// java.io
	// 4 abstract classes on the top
	// 2 for character based streams and 2 for byte based streams
	// Reader and Writer for character based stream
	// InputStream and OutputStream for byte based stream
	// FileReader and FileWriter, FileInputStream and FileOutputStream
	public static void main(String[] args) {
		File file = new File("sample.txt");
		System.out.println(file.getName());
		System.out.println(file.exists());
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(file.exists());
		System.out.println(file.isHidden());
		System.out.println(file.isFile());
		
		// further explore other properties of File
		// also represent a directory in a File object
	}
}
