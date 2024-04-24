package folder;

import java.io.File;
import java.io.IOException;

public class FolderDemo {

	public static void main(String[] args) {
		
//		create folder inside the workspace
		
		File f = new File("Test");
		System.out.println(f.mkdir());
		
//		create folder in a specific location
		
		File f1 = new File("C:\\Users\\RICK\\OneDrive\\Desktop\\Test123");
		System.out.println(f1.mkdir());
		
//		to check whether a file is present or not
		
		System.out.println(f.exists());
		System.out.println(f1.exists());
		
//		delete a folder in the project
		
		System.out.println(f.delete());
		
//		create a file
		
		File f2 = new File("C:\\Users\\RICK\\OneDrive\\Desktop\\Test123\\Rick.txt");
		try 
		{
			System.out.println(f2.createNewFile());
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
//		rename a file
		
		File f3 = new File("C:\\\\Users\\\\RICK\\\\OneDrive\\\\Desktop\\\\Test123\\\\Rick123.txt");
			System.out.println(f2.renameTo(f3));
		
	}
}
