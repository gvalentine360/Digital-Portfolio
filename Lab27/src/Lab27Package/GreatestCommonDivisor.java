//Garrett Valentine
//Greatest common divisor

package Lab27Package;


public class GreatestCommonDivisor
{
	public static void main(String[]args)
	{
		System.out.println("\nThe GCD of " + 123450 + " and " + 60378 + " is " + gcd(123450 , 60378));
		
		
	}
	
	public static int gcd(int dividend, int divisor)
	{
		System.out.print("gcd( " + dividend + ", " + divisor + " )");
		System.out.println(" " + dividend + " % " + divisor + " = " + (dividend % divisor ));
		
		if(dividend % divisor == 0)
		{
			System.out.println("\nbase case reached, returning " + divisor + "\n");
			return divisor;
			
		}
		else
		{
			int temp = gcd(divisor, dividend % divisor);
			System.out.println("gcd( " + divisor + ", " + (dividend % divisor) + " ) returning " + temp);
			
			return(temp);
		}
	}
	
}

