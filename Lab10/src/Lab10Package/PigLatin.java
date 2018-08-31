//Garrett Valentine
//Pig latin

package Lab10Package;
import java.util.Scanner;


public class PigLatin
{
	public static void main(String[]args)
	{
		
		Scanner input = new Scanner(System.in); //Scanner
		
		System.out.println("Please type in a word"); //Asks user to type a word
		
		String word = input.nextLine();	//Scanner input
		
		String lowerCase = word.toLowerCase();  //Converts word to a lowercase
		
		char letter = lowerCase.charAt(0); //shows you what the first character is
	
		
		String vowel = "way";
		String consonant = letter +"ay";
		String moveLetter = lowerCase.substring(1); //removes the first letter
		
		char a1 = 'a';
		char e1 = 'e';
		char i1 = 'i';		//Vowels
		char o1 = 'o';
		char u1 = 'u';
		
		if ((letter == a1) || (letter == e1) || (letter == i1 ) ||( letter == o1 ) || (letter == u1))
				System.out.println("Your word in pig latin is: " + lowerCase + vowel);
		
		else if ((letter != a1) ||(letter != e1) ||(letter != i1) || (letter != o1)||(letter != u1))
				System.out.println("Your word in pig latin is: " + moveLetter + consonant);
		
	}
}