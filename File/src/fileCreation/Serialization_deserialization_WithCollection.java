package fileCreation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Serialization_deserialization_WithCollection {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		ArrayList<Student> a = new ArrayList<Student>();
		
//		serialization
		a.add(new Student("Dinesh", 112));
		a.add(new Student("Meer", 113));
		a.add(new Student("Anjali", 114));
		a.add(new Student("Sridhar", 115));
		a.add(new Student("Pravin", 116));
		ObjectOutputStream objout = new ObjectOutputStream(new FileOutputStream("Student_details1.txt"));
		objout.writeObject(a);
		
//		deserialization
		ObjectInputStream objin = new ObjectInputStream(new FileInputStream("Student_details1.txt"));
		ArrayList<Student> a1 = (ArrayList) objin.readObject();
		
		for(Student s : a1)
		{
			System.out.print(s);
		}
	}
}
