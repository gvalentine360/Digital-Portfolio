//Garrett Valentine
//Search program

package Lab25Package;

import java.util.Random;
import java.util.Scanner;

public class Search
{
	public static void main(String[]args)
	{
		Random pick = new Random();
		
		Scanner scan = new Scanner(System.in);
		
		int [] numbers = new int[50];
		
		for(int i = 0; i < numbers.length; i++)
		{
			numbers[i] = pick.nextInt(100) + 1;
		}
		
		display(numbers);
		sort(numbers);
		System.out.println("Sorted Array: ");
		display(numbers);
		
		System.out.println("Enter a value to find: ");
		int what = scan.nextInt();
		
		int where = binarySearch(numbers, what);
		
		if(where == -1)
			System.out.println("Value is not in the array.");
		else
			System.out.println("Value is in location " + where);
		
			
		
	}
	
	public static void sort(int a[])
	{
		
		for (int i = 1; i < a.length; i++)
		{
			
			int temp = a[i];
			int j = i - 1;
			while ((j >= 0) && (temp < a[j]))
			{
				
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = temp;
		}
			
	}
	
	public static int binarySearch(int n[], int key)
	{
		int start = 0, end = n.length-1, mid, spot = -1;
		boolean found = false;
		
		while ((end >= start) && !(found))
		{
			mid = (start + end) / 2;
			if(n[mid] == key)
			{
				found = true;
				spot = mid;
			}
			else if (n[mid] > key)
				end = mid - 1;
			else
				start = mid + 1;
			System.out.println(mid);
		}
		return spot;
	}
	
	public static void display(int a[])
	{
		for(int i = 0; i < a.length; i++)
			System.out.println(a[i] + " ");
		System.out.println();
		
	}
}