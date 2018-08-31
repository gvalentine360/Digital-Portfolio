//Garrett Valentine
//Reverse program

package Lab20Package;

import java.util.Scanner;

public class Reverse
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		
		//array of 6 decimal values
		double[] numbers = new double[6];
		
		//uses arrays length to attribute to display number of elements
		System.out.println("Array size is " + numbers.length);
		
		// repeatedly ask for input values, storing them in array
		// use length attribute to determine loop iterations
		
		for(int index = 0; index < numbers.length; index++)
		{
			System.out.println("Enter number at position " + (index+1)+": " );
			numbers[index] = scan.nextDouble();
			
		}
		
		//displays numbers in reverse order
		System.out.println("The values in reverse:" );
		for(int index = numbers.length-1; index >= 0; index--)
			System.out.println(numbers[index]);
		scan.close();

		
	}
}