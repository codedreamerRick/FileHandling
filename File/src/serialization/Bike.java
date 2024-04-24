package serialization;

import java.io.Serializable;

public class Bike implements Serializable {

	String brand;
	
	Bike(String brand)
	{
		this.brand = brand;
	}
	
	@Override
	public String toString() 
	{
		return "Brand : "+brand+"\n";
	}
}
