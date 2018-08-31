//Garrett Valentine
//Circumference for a circle.

package Lab6Package;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Circumference
{
	public static void main(String[]args)
	{
		String circleInput = 
				JOptionPane.showInputDialog(null, " Radius of the circle: "); //Displays pop up box and inputs the radius of circle
		int radiusParse = Integer.parseInt(circleInput); //Converts string to a int
		double pi = 3.14; //pi
		double circumference = 2*pi*radiusParse; //calculating the circumference
		
		JOptionPane.showMessageDialog(null, "The circumference of the circle is: " +  circumference ); //pop up box displaying circumference
	}
}

