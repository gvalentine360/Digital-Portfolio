//Garrett Valentine
//Tax and Tip program

package Lab6Package;
import java.text.DecimalFormat;
import java.util.Scanner;

public class TaxAndTip
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in); //Scanner
		
		System.out.println("Cost of the meal: "); //Prints cost of the meal:
		
		
		double mealCost = input.nextDouble(); //User inputs a price
		
		double salesTax = mealCost * 0.075; //Calculates sales tax
		
		double salesTaxSum = mealCost + salesTax; //Adds sales tax and meal cost
		
		double tip = salesTaxSum * 0.20; //Tip amount
				
		
		DecimalFormat americanCurrency = new DecimalFormat("$##,##0.00"); //Turns decimal into American currency format.
		
		System.out.println("Total (Including Tax): "  + americanCurrency.format(salesTaxSum)); //Displays total price
		
		System.out.println("Tip: " + americanCurrency.format(tip)); //Displays tip
		
		
		
		
	}
	
}