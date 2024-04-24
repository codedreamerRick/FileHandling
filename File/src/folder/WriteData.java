package folder;

import java.io.FileWriter;
import java.io.IOException;

public class WriteData {

	public static void main(String[] args) throws IOException {
		
//		write data into the file
		
		FileWriter fw = null;
//		try
//		{
			fw = new FileWriter("C:\\Users\\RICK\\OneDrive\\Desktop\\Test123\\Rick11.txt");
			fw.write("hellooooooo Rick");
			System.out.println("Data is written successfully...!");
			fw.flush();
			
//			apending data
			
//			fw = new FileWriter("Rick11.txt", true);
//			fw.write(" how are you?");
//			System.out.println("Data apended successfully...! ");
//		}
//		catch (Exception e) 
//		{
//			
//		}
//		finally 
//		{
//			try 
//			{
//				fw.close();
//			} 
//			catch (IOException e) 
//			{
//				e.printStackTrace();
//			}
//		}
	}
}
