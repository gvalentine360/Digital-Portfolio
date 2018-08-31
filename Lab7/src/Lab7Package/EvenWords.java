//Garrett Valentine
//Even Words

package Lab7Package; 
import javax.swing.JOptionPane;

public class EvenWords
{
	public static void main(String[]args)
	{
		String input = JOptionPane.showInputDialog(null, "Please input a single word."); //Input word
		
		int wordLength = input.length(); //shows word length
		
		int evenOrOdd = wordLength % 2; //finds remainder
		
		if (evenOrOdd == 0) //If
		{
			JOptionPane.showMessageDialog(null, "Your word is even!");//Displays if even
		}
		else // Else
		{
			JOptionPane.showMessageDialog(null, "Your word is odd!");//Displays if odd
		}
		
				
			
		
		
	}
}