//Garrett Valentine
//Pythagorean Theorem
package Lab5Package;
import java.util.Scanner;


public class PythagoreanTheorem
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the length for side A:");
		int a = input.nextInt();
		System.out.println("Please enter the length for side B:");
		int b = input.nextInt();
		
		double aSquared = Math.pow(a, 2);
		double bSquared = Math.pow(b, 2);
		double sum = aSquared + bSquared;
		double hypotenuse = Math.sqrt(sum);
		
		System.out.println("The hypotenuse is " + hypotenuse);
		
	}
}