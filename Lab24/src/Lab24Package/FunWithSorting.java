//Garrett Valentine
//Fun with sorting program

package Lab24Package;

public class FunWithSorting
{
	public static void main(String[]args)
	{
		int [] numArray =  {27, 30, 15, 73, 9, 11, 41, 62, 57, 3};
		
		print(numArray);
		sort(numArray);
		print(numArray);
		

	}//Main
	
	public static void print(int [] n)
	{ //Displays the array
		for (int i = 0; i < n.length; i++)
		{
			System.out.print(n[i] + " ");
			System.out.println();
			
		}
	}
	
	public static void sort(int[] n)
	
	{
		
		int iterates = 0, comps = 0, swaps = 0;
		for (int i = 1; i < n.length; i++)
		{
			iterates++;
			comps++;
			
			int temp = n[i];
			int j = i - 1;
			while ((j >= 0) && (temp < n[j]))
			{
				iterates++;
				n[j+1] = n[j];
				j--;
			}
			n[j+1] = temp;
			swaps++;
			
		}
		System.out.println("iterates: " + iterates);
		System.out.println("comps: " + comps);
		System.out.println("swaps: " + swaps);
		
	}//insertion sort
	
	/*public static void sort(int [] n)
	{
		
		int iterates = 0, comps = 0, swaps = 0;
		
		int max, temp;
		
		for(int i = n.length-1; i > 0; i--)
		{
			swaps++;
			iterates++;
			max = 0;
			for(int j = 1; j <= i; j++)
			{
				
				iterates++;
				comps++;
				if(n[j] > n[max])
				{
					max = j;
				}
				temp = n[max];
				n[max] = n[i];
				n[i] = temp;
			}
			
		}//selection sort
		System.out.println("Iterates: " + iterates);
		System.out.println("comps: " + comps);
		System.out.println("swaps: " + swaps);
		
		*/
}
	




