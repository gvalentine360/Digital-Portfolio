//Garrett Valentine  
//Pick a card program  
package Lab9Package;  
import javax.swing.JOptionPane;  
import java.util.Random;  

public class Cards
{  
    public static void main(String[]args)
    {  

  

        Random suits = new Random();  

  

        int drawSuits = suits.nextInt(4) + 1;  

  

        Random cards = new Random();  

  

        int drawCards = cards.nextInt(13) + 1; 
        
        
            if (drawSuits == 1)      

           JOptionPane.showMessageDialog(null,"Your card is a Club"); 

             

            if(drawSuits == 2) 

                JOptionPane.showMessageDialog(null," Your card is a Diamond"); 

            if(drawSuits == 3) 

                JOptionPane.showMessageDialog(null, "Your card is a Heart"); 

            if(drawSuits == 4) 

                JOptionPane.showMessageDialog(null,  "Your card is a Spade"); 

             

            if(drawCards == 1) 

                JOptionPane.showMessageDialog(null," Your card is a Ace."); 

            if(drawCards == 2) 

                JOptionPane.showMessageDialog(null,"Your card is a 2"); 

            if(drawCards == 3) 

                JOptionPane.showMessageDialog(null," Your card is a 3"); 

            if(drawCards == 4) 

                JOptionPane.showMessageDialog(null, "Your card is a 4"); 

            if(drawCards == 5) 

                JOptionPane.showMessageDialog(null,  "Your card is a 5"); 

            if(drawCards == 6) 

                JOptionPane.showMessageDialog(null, "Your card is a 6"); 

            if(drawCards == 7) 

                JOptionPane.showMessageDialog(null, "Your card is a 7"); 

            if(drawCards == 8) 

                JOptionPane.showMessageDialog(null, "Your card is a 8"); 

            if(drawCards == 9) 

                JOptionPane.showMessageDialog(null, "Your card is a 9"); 

            if(drawCards == 10) 

                JOptionPane.showMessageDialog(null,  "Your card is a 10"); 

            if(drawCards == 11) 

                JOptionPane.showMessageDialog(null," Your card is a Jack"); 

            if(drawCards == 12) 

                JOptionPane.showMessageDialog(null, "Your card is a Queen"); 

            if(drawCards == 13) 

                JOptionPane.showMessageDialog(null, "Your card is a King");                  

    }		
		
}		
		
		
		
		
		
		
		
			
			
		
		
		
		
		
		
	

