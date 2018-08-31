//Garrett Valentine

//Bubble Sort Program

package Lab23Package;

import java.util.Scanner;

public class BubbleSort

{

	public static void main(String[]args)

	{

		Scanner scan = new Scanner(System.in);

		String [] Names = {"Jean", "Scott", "Warren", "Charles", "Kurt", "Hank", "Bobby", "Kitty", "Ororo", "Emma",

				"James", "Peter", "Wade", "Betsy", "Remy", "N/A", "N/A", "N/A", "N/A", "N/A"};

		for(int index = 0; index < Names.length; index++)

		{

			System.out.println(Names[index]);

		}

		System.out.println("Please input 5 additional names.");

		for(int index = 15 ; index < Names.length; index++)

		{

			String input = scan.nextLine();

			Names[index] = input;

		}

		bubbleSort(Names);

		for(int index = 0; index < Names.length; index++)

		{

			System.out.println(Names[index]);

		}

}

	public static void bubbleSort(String n [])

	{

		String temp;

		for(int i = 0; i < n.length-1; i++)

		{

			for(int j = 0;j < n.length-i-1; j++)

			{

				if(n[j].compareTo(n[j + 1]) > 0)

				{

					temp = n[j];

					n[j] = n[j+1];

					n[j+1] = temp;

				}

			}

		}

	}

}