//Garrett Valentine
//Spanish Vocabulary Program

package Lab22Package;


import java.util.Scanner;


public class SpanishVocabularyProgram
{
	public static void main(String[]args)
	{
		String [] EnglishWords = {"dog","cat","banana", "car", "firefighter", "cheese","door","chair","question","scary clown"};
		String [] SpanishWords = {"el perro","el gato","el platano","el coche","el bomber","el queso","la puerta","la silla","la pregunta","el payaso asustado"};
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please input a English word: ");
		
		String searchWord = scan.nextLine().toLowerCase();
		
	
		
		int numLocation = linearSearch(EnglishWords , searchWord);
		
		
		
		if(numLocation != -1)
		{
			System.out.println("The Spanish word for " + EnglishWords[numLocation] + " is " + SpanishWords[numLocation] + ".");
		}
		else
		{
			System.out.println("The word was not found.");
		}
		
	}
	
	public static int linearSearch(String e[], String key)
	{
		boolean found = false;
		int index = 0;
		int spot = -1;
		
		while(!(found) && (index < e.length))
		{
			if(e[index].equals(key))
			{
				found = true;
				spot = index;
			}
			
			index++;
			
		}
		
		return spot;
	}
	
}

