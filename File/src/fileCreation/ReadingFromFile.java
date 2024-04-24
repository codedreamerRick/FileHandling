package fileCreation;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadingFromFile {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("MyDetails.txt");
		fw.write("Hello Good Morning...!");
		fw.write(" I am an employee of Test Yantra.");
		fw.write(" I am happy ");
		System.out.println("Data written successfully...!");
		fw.flush();
		fw.close();
		
		System.out.println("Reading the data from the file...!");
		System.out.println();
		FileReader fr = new FileReader("MyDetails.txt");
		int ch = fr.read();
		while(ch != -1)
		{
			System.out.print((char)ch);
			ch = fr.read();
		}
	}
}
