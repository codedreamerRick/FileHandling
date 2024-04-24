package serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class VehicleDriver {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

//		serialization

		File x = new File("car.txt");
		ArrayList vehicle = new ArrayList();
		 Scanner scan = new Scanner(System.in);
		try 
		{
			FileOutputStream y = new FileOutputStream(x);
			ObjectOutputStream z = new ObjectOutputStream(y);
			vehicle.add(new Car("BMW"));
			vehicle.add(new Car("Audi"));
			vehicle.add(new Car("JLR"));
			vehicle.add(new Car("Mercedes"));
			vehicle.add(new Bike("BMW"));
			vehicle.add(new Bike("Ducati"));
			vehicle.add(new Bike("Suzuki"));
			vehicle.add(new Bike("Ninja"));
			z.writeObject(vehicle);
			z.flush();
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}

//		de-serialization

		FileInputStream f = new FileInputStream(x);
		ObjectInputStream o = new ObjectInputStream(f);
		Object o1 = null;
		System.out.println("Enetr the vehicle");
		String name = scan.next();
		while (true) 
		{
			try 
			{
				o1 = o.readObject();
			} 
			catch (Exception e)
			{
				return;
			}
			
			if (name.equalsIgnoreCase("Car")) 
			{
				for(Object obj : vehicle)
				{
					try
					{
						Car c = (Car) obj;
						System.out.print(c);
					}
					catch(Exception e)
					{
						
					}
				}
			}
			else
			{
				for(Object obj : vehicle)
				{
					try
					{
						Bike b = (Bike) obj;
						System.out.print(b);
					}
					catch(Exception e)
					{
						
					}
				}
			}
		}
	}
}
