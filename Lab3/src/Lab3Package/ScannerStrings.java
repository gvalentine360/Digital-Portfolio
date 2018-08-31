//Garrett Valentine
//Scanner


package Lab3Package;
import java.util.Scanner;

 class ScannerStrings
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Your Phrase?");
		String phrase = input.nextLine();
		String upperCase = phrase.toUpperCase();
		System.out.println(upperCase);
		int phraseLength = phrase.length();
		System.out.println("The length of the phrase is " + phraseLength);
		String www = "www.";
		String com = ".com";
		System.out.println("The URL is " + www + phrase + com);
		
		
		
		
	}
}