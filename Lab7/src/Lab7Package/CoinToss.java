//Garrett Valentine
//Coin Toss Program

package Lab7Package;
import javax.swing.JOptionPane;
import java.util.Random;

public class CoinToss
{
	public static void main(String[]args)
	{
		Random toss = new Random(); //Random Number
		
		int coinToss = toss.nextInt(2); // Random number from 0 to 1
		
		if (coinToss == 0)
			JOptionPane.showMessageDialog(null, "The coin is heads!"); // if 
		
		else
			JOptionPane.showMessageDialog(null, "The coin is tails!"); // else
		
		
		
		
		
		
	}
}
