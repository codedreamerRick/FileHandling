package fileCreation;

import java.io.*;;

public class Serialization_Deserialization {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
//		serialization
		ObjectOutputStream objout = new ObjectOutputStream(new FileOutputStream("Student_details.txt"));
		objout.writeObject(new Student("Dinesh", 112));
		objout.writeObject(new Student("Meer", 113));
		objout.writeObject(new Student("Anjali", 114));
		System.out.println("Object stored...");
		objout.flush();
		objout.close();
		
//		deserialization
		ObjectInputStream objin = new ObjectInputStream(new FileInputStream("Student_details.txt"));
		System.out.println("Student Details...\n");
		while(true)
		{
			try
			{
				Student s = (Student)objin.readObject();
				System.out.println(s);
			}
			catch(Exception e)
			{
				break;
			}
		}
	}
}



class Student implements Serializable
{
	String name;
	int sid;
	
	Student(String name, int sid)
	{
		this.name = name;
		this.sid = sid;
	}
	
	@Override
	public String toString() 
	{
		return this.name+" : "+this.sid+"\n";
	}
}
