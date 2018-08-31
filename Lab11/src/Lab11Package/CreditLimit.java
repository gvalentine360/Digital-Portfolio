//Garrett Valentine
//Credit limit program

package Lab11Package;
import java.util.Scanner;


public class CreditLimit
{
	
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		
		
		int credit = 0;					//Credit Variable
		final int THRESHOLD = 500;		//Threshold constant
		
		
		while (credit <= THRESHOLD) 	
		{
			System.out.println("Enter a credit charge");
			int money = input.nextInt();
			credit += money;
		}
		
		System.out.println("You have exceeded your credit limit");
		
	}
}
