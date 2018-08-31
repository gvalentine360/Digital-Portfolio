//Garrett Valentine
//Array Names program

package Lab20Package;


import java.util.Scanner;

public class ArrayNames
{

		
	public static void main(String[]args)
	{
		
		final int MAX = 10;
		
		Scanner scan = new Scanner(System.in);
		
		String[] names = new String[10];
		
		for(int index = 0; index < MAX; index++)
		{
			System.out.println("Please enter a name at position " + (index+1)+ ": ");
			names[index] = scan.nextLine();
		}
		
		System.out.println("The names in reverse");
		for(int indexA = 9; indexA > 0; indexA--)
		{
			System.out.println(names[indexA].toUpperCase());
			
		}
			
			
		
	}
	
		
}