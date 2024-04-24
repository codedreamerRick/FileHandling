package fileCreation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_FileReader {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fw = new FileOutputStream("MyDetails.txt");
		fw.write("Hello Good Morning...!".getBytes());
		fw.write(" I am an employee of Test Yantra.".getBytes());
		fw.write(" I am happy ".getBytes());
		System.out.println("Data written successfully...!");
		fw.flush();
		fw.close();
		
		FileOutputStream fw1 = new FileOutputStream("MyDetails.txt", true);
		fw1.write(" ====== I am from Bangalore.".getBytes());
		fw1.write(" We all are Indians.".getBytes());
		System.out.println("Data appended1 successfully...!");
		fw1.flush();
		fw1.close();
		
		FileOutputStream fw2 = new FileOutputStream("MyDetails.txt", true);
		fw2.write(" ======  About my parents.".getBytes());
		fw2.write(" My parents are awesome.".getBytes());
		System.out.println("Data appended2 successfully...!");
		fw2.flush();
		fw2.close();
		
		System.out.println("Reading the data from the file...!");
		System.out.println();
		FileInputStream fr = new FileInputStream("MyDetails.txt");
		int ch = fr.read();
		while(ch != -1)
		{
			System.out.print((char)ch);
			ch = fr.read();
		}
		fr.close();
	}
}
