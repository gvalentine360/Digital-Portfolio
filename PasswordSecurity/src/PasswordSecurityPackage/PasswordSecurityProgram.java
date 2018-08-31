//Garrett Valentine

//Password Security Program

package PasswordSecurityPackage;

import javax.swing.JOptionPane;

public class PasswordSecurityProgram
{

	public static void main(String[]args)
	{

		String userInput = JOptionPane.showInputDialog(null, "Password Guidelines:\n1. The password must be atleast 8 characters long."

	+ "\n2. The password must contain at least one character from a set that contains the &, @, and $ characters."

	+ "\n3. The password must not contain spaces."

	+ "\n4. The password must not begin with a numeric digit."

	+ "\n5. The first three characters cannot be the same."

	+ "\n6. The last three characters cannot be the same."

	+ "\nPlease input your password"); //Shows the user the password guidelines and also prompted to input a password

		int length = userInput.length(); //finds the length from the string userInput

		int specialCharacter1 = userInput.indexOf("&"); //Finds the first occurrence of &

		int specialCharacter2 = userInput.indexOf("$"); //finds the first occurrence of $

		int specialCharacter3 = userInput.indexOf("@"); //finds the first occurrence of @

		int space = userInput.indexOf(" "); //finds the first occurrence of space

		int zero = userInput.indexOf("0");

		int one = userInput.indexOf("1");

		int two = userInput.indexOf("2");

		int three = userInput.indexOf("3");

		int four = userInput.indexOf("4");

		int five = userInput.indexOf("5"); //Finds all the first occurrences of numbers 0 through 9.

		int six = userInput.indexOf("6");

		int seven = userInput.indexOf("7");
		
		int eight = userInput.indexOf("8");

		int nine = userInput.indexOf("9");

		char charOne = userInput.charAt(0); //finds the character at the index of 0

		char charTwo = userInput.charAt(1); //finds the character at the index of 1

		char charThree = userInput.charAt(2); //finds the character at the index of 2

		int lastCharacter = length -1; //length of the string - 1

		int secondToLastCharacter = length - 2; //length of the string - 2

		int thirdToLastCharacter = length - 3; //length of the string -3

		char charLast = userInput.charAt(lastCharacter); //Finds the last character in the index

		char charSecondToLast = userInput.charAt(secondToLastCharacter); //Finds the second to last character in the index

		char charThirdToLast = userInput.charAt(thirdToLastCharacter); //Finds the third to last character in the index.
	
		boolean accepted = true;
	
	if(length <= 8) //Displays a pop-up box if the users password is less than or equal to 8 characters
		
	{

		JOptionPane.showMessageDialog(null, "Password Rejected! Your password is not 8 characters or more.");
		accepted = false;
	}

	if((specialCharacter1 == -1) && (specialCharacter2 == -1) &&(specialCharacter3 == -1)) //Displays a pop-up box if the password does not contain $, &, or @

	{

		JOptionPane.showMessageDialog(null, "Password Rejected! Your password should contain &, $, or @.");
		accepted = false;
	}

	if(space != -1) //Displays a pop-up box if there is a space in the password

	{	
		
		JOptionPane.showMessageDialog(null, "Password Rejected! Your password should not contain a space.");
		accepted = false;
	}

	if(((zero == 0) || (one == 0) || (two == 0) || (three == 0) || (four == 0) || (five == 0) || (six == 0) || (seven == 0) || (eight == 0 || (nine == 0))))

	{

		JOptionPane.showMessageDialog(null, "Password Rejected! Your password should not start with a numeric digit."); // Displays a pop-up box if the password starts with a numeric digit.
		accepted = false;
	}

	if((charOne == charTwo) && (charOne == charThree)) //Displays pop-up box if the first three characters are the same

	{

		JOptionPane.showMessageDialog(null, "Password Rejected! Your first three characters should not be the same!");
		accepted = false;
	}

	if((charLast == charSecondToLast) && (charLast == charThirdToLast)) //Displays pop-up box if the last three characters are the same

	{

		JOptionPane.showMessageDialog(null, "Password Rejected! Your last three characters should not be the same!");
		accepted = false;
	}
	
	if(accepted == true)//Displays a pop up box if the users password is accepted.
	{

		JOptionPane.showMessageDialog(null, "Password Accepted!");

	}

	}

}