//Garrett Valentine
//Higher Lower Game

package Lab12Package;
import java.util.Scanner;
import java.util.Random;

public class HigherLowerGame
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in); //Scanner
		
		Random number = new Random(); //Random
		
		int guesses = 0; //Number of guesses
		
		int randomNumber = number.nextInt(100) + 1; //Random number between 1 and 100
		
		System.out.println("Guess the number! Please input a number!"); //Asks the user to input a number
		
		int userInput = input.nextInt(); //Gets the users input
		
		while(userInput != randomNumber) //while
		{
			
			guesses++; //adds 1 to guesses everytime user guesses
			
			if(userInput > randomNumber)
			{
				System.out.println("Lower!");
				userInput = input.nextInt();
			}
			else if(userInput < randomNumber)
			{
				System.out.println("Higher!");
				userInput = input.nextInt();
			}
		}
		
		System.out.println("Congratulations! You have guessed the correct number. You guessed "+ guesses + " times");
	}
}