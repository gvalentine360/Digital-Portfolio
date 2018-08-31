//Garrett Valentine
//Final review lab.

package Lab28Package;

import java.util.Scanner;
import java.util.Random;

public class Final
{
	public static void main (String[]args)
	{
		int oddCount = 0; //Odd counter
		
		int evenCount = 0; //Even Counter
		
		Random rand = new Random(); //Random numbers
		
		Scanner scan = new Scanner(System.in); //Scanner
		
		System.out.println("Please enter your name."); //Asks user to print name
		
		String Name = scan.nextLine(); //Gets users name
		
		System.out.println("Hello " + Name.toUpperCase() + "!"); // Greets user, and prints there name in uppercase.
		
	
		int [] numbers = new int[100]; //Array 100 elements
		
		int sum = 0; //Sum
		
		for(int i = 0; i < numbers.length; i++)// for loop puts random numbers in element locations
		{
			
			
			numbers[i] = rand.nextInt(50) + 1; //Puts random number in location
			
			sum += numbers[i]; //Adds random number location to sum.
			
			System.out.println(numbers[i]);// Prints out all of the elements in the array.
			
			
			
			
		}
		double average = sum / numbers.length; // finds average
		
		System.out.println("The average of all the numbers in the array is:  " + average); //Prints out average
		
		for(int i = 0; i < numbers.length; i++) //For loop that counts even and odd numbers.
		{
			if(numbers[i] % 2 == 0)
			{
				evenCount++; 
			}
			else
			{
				oddCount++;
			}
		}
		System.out.println("Amount of even numbers: " + evenCount); //Prints even count
		System.out.println("Amount of odd numbers: " + oddCount);	//prints odd count
		
	}
}