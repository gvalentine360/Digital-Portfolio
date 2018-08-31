//Garrett Valentine
//Temperature Conversion

package Lab2Package;

public class TemperatureConversion
{	
	public static void main(String[]args)
	{
		 	double FreezingPoint = 32; 

	        double Fahrenheit = 100; 

	        double FFP = Fahrenheit - FreezingPoint; 

	        double Celcius = 5.0/9.0*FFP; 

	        System.out.println("Temperature in Celcius is " + Celcius); 

	         

	     

	        double Fahrenheit2 = 9.0/5.0*Celcius; 

	        double Fahrenheit3 = Fahrenheit2 + 32; 

	         

	        System.out.println("Temperature in Fahrenheit is " + Fahrenheit3); 
	
	}

}