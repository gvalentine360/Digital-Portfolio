//Garrett Valentine 

//Snowman Program 

  

package Lab8Package; 

import java.awt.Color; 

import java.awt.Graphics; 

import javax.swing.JApplet; 

  

public class Snowman extends JApplet 

{ 

    public void paint(Graphics g) 

    { 

        super.paint(g); 

         

        g.setColor(Color.WHITE); 

        g.fillOval(500, 500, 150, 150);   //First Circle 

         

        g.fillOval(510, 430, 120, 120);   //Second circle 

     

         

        g.setColor(Color.WHITE); 

        g.fillOval(520, 370, 90, 90); //Third Circle 

        g.setColor(Color.BLACK); 

         

        g.fillRect(517, 360, 100, 10);  //Top Hat 

        g.fillRect(540, 320, 50, 40 );  

         

        g.drawLine(540,420,570,420); // Mouth 

         

        g.fillOval(520, 390, 20, 20);  //Eyes 

        g.fillOval(560, 390, 20, 20); 

         

         

        g.drawLine(520,450,450,400);    //Right Arm 

        g.drawLine(600, 450, 650, 400);  //Left Arm 

         

        g.fillOval(545 ,400, 10, 10); //Nose 

         

         

    } 

     

} 