package serialization;

import java.io.Serializable;

public class Car implements Serializable {

	String brand;
	
	Car(String brand)
	{
		this.brand = brand;
	}
	
	@Override
	public String toString() 
	{
		return "Brand : "+brand+"\n";
	}
}
