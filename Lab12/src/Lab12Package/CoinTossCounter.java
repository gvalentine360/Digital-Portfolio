//Garrett Valentine
//Coin toss counter program

package Lab12Package;
import java.util.Random;

public class CoinTossCounter
{
	public static void main(String[]args)
	{
		Random toss = new Random(); 
		final int STOP = 100;
		int heads = 0; 
		int tails = 0;
		int total = 0;
		
		
		while (total <= STOP)
		{
			int coinToss = toss.nextInt(2); //Heads 0 and Tails is 1
			total++;
			
			if(coinToss == 0) //Heads
			{
				heads++; //Adds one to Heads
			}
			else
			{
				tails++; //Adds one to tails
			}
			
		
		}
		
		System.out.println("Heads: " + heads + "\nTails: " + tails); //Displays the totals
	}
}