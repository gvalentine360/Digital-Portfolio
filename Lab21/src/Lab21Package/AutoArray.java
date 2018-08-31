//Garrett Valentine
//Auto Array Program

package Lab21Package;

import java.util.Scanner;

public class AutoArray
{
	public static void main(String[]args)
	{
		Auto car0 = new Auto("Ford", "Mustang", 2015);
		Auto car1 = new Auto("Chevrolet", "Malibu", 2009);
		Auto car2 = new Auto("Buick" , "LaCrosse", 2015);
		Auto car3 = new Auto("Pontiac", "Grand Prix", 2004);
		
		Auto [] cars = new Auto[4];
		cars[0] = car0;
		cars[1] = car1;
		cars[2] = car2;
		cars[3] = car3;
		
		
		
		Scanner scan = new Scanner(System.in);
		
		for(int count = 0; count < cars.length; count++ )
		{
			
			System.out.println("Please set the mileage for: \n" + cars[count]);
			double mileage = scan.nextDouble();
			cars[count].adjustMiles(mileage);
			
			
		}
		for(int count = 0; count < cars.length; count++)
		{
			System.out.println(cars[count]);
			System.out.println("\n");
		}
		
	}
}