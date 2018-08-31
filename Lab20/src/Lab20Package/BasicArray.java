//Garrett Valentine
//Basic Array

package Lab20Package;


public class BasicArray
{
	public static void main(String[]args)
	{
		final int MAX = 15;			//Maximum number of elements
		final int MULT = 5;			//Value used in multiplication
		
		//array of integers of maximum size
		int [] list = new int [MAX];
		
		//initialize array with integers as multiples of 5
		for (int index = 0; index < MAX; index++)
		{
			list[index] = index * MULT;
		}	
			//Changes value in location 8
			list[8] = 999;
			
			//display array elements on one line of output
		for(int space = 0; space < MAX; space++)
		{
				System.out.println(list[space]+ " ");
				System.out.println();
		}
	}
}