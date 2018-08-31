//Garrett Valentine
//Loose Change program
package Lab4Package;
import java.util.Scanner;


public class LooseChange
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		
		
		
		System.out.println("How many quarters?");
		double quarters = input.nextDouble();
		System.out.println("How many dimes?");
		double dimes = input.nextDouble();
		System.out.println("How many nickels?");
		double nickels = input.nextDouble();
		System.out.println("How many pennies?");
		double pennies = input.nextDouble();
		
		double coins = quarters + dimes + nickels + pennies;
		
		double quartersValue = quarters * 0.25;
		double dimesValue = dimes * 0.10;
		double nickelsValue = nickels * 0.05;
		double penniesValue = pennies* 0.01;
		double totalValue = penniesValue + nickelsValue + dimesValue + quartersValue;
		
		System.out.println("You have  " + coins  + " Coins");
		System.out.println("The coins are worth " + "$" +totalValue);
		
	}
}