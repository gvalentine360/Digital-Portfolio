package Lab1Package;

//Garrett Valentine
//Program finds Homers bowling average score.

public class Lab1
{
	public static void main(String [] args)
	{
		int h1 = 176;				//Homers score from game 1
		int h2 = 163;				//Homers score from game 2
		int h3 = 171;				//Homers score from game 3
		int sum = h1 + h2 + h3;		//Homers score added
		int average = sum/3;		//Homers average 
		
		System.out.println("Homers average score is " + average + "."); //Prints Homers average score.
		
	}
	
}
