//Garrett Valentine
//Geography program

package Lab26Package;

public class Geography
{
	public static void main(String[]args)
	{
		String [][] geo = {{"MD", "NY", "NJ", "MA", "ME", "CA", "MI", "OR"},
							{"Detroit", "Newark", "Boston", "Seattle"}};
			
		System.out.println(geo[1][2]); //Question 33
		
		

		System.out.println(geo[0][5]); //Question 34
		
		
	
		for(int j = 0 ; j < geo[0].length; j++) //Question 35
		{
			
			if(geo[0][j].charAt( 0 ) == 'M')
			{
				System.out.println(geo[0][j]);
			}
			
		}
		
		for(int j = 0; j < geo[1].length; j++)
		{
			System.out.println(geo[1][j]);
		}
		
		
		
		
		
	}
}