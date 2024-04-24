package fileCreation;

import java.io.*;

public class FileOutputStream_InputStream {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fout = new FileOutputStream("TYSS.txt");
		fout.write("Hello Good Morning! ".getBytes());
		fout.write("How are you??? ".getBytes());
		fout.write("Welcome to TYSS.".getBytes());
		fout.flush();
		fout.close();
		System.out.println("Data written...");
		
		FileOutputStream fout1 = new FileOutputStream("TYSS.txt",true);
		fout1.write("Hello Good Morning! ".getBytes());
		fout1.write("How are you??? ".getBytes());
		fout1.write("Welcome to TYSS.".getBytes());
		fout1.flush();
		fout1.close();
		System.out.println("Data appended...");
	}
}
