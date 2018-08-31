//Garrett Valentine
//Random Multiplication

package Lab6Package;
import java.util.Scanner;
import java.util.Random;

public class RandomMultiplication
{
	public static void main(String[]args)
	{
		
		Scanner input = new Scanner(System.in); //Scanner
		
		System.out.println("Enter an integer: "); //prints a message
		
		int numberInput = input.nextInt(); //Scanner
		
		Random number = new Random(); //Random Number
		
		int randomNumber = number.nextInt(12) + 1; // Random number 1 through 12
		
		System.out.println("The computer choose " + randomNumber); // prints out randomNumber
		
		int product = numberInput * randomNumber; //The product 
		
		System.out.println(numberInput + " * " + randomNumber + " = " + product); //prints out answer
		
		
	}
}





