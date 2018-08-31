//Garrett Valentine
//Maximum Grade

package Lab15Package;
import java.util.Scanner;
import java.io.*;

public class MaximumGrade
{	
	public static void main(String[]args)throws IOException
	{
		int maxGrade;
		int grade;
		
		Scanner file = new Scanner(new File("grades.txt"));
		
		System.out.println("This program finds the maximum grade for a class.");
		
		if(! file.hasNext())
		{
			System.out.println("No test grades are in the file");
			
		}
		else
		{
			maxGrade = file.nextInt();
			
			while(file.hasNext())
			{
				grade = file.nextInt();
				
				if(grade >maxGrade)
					maxGrade = grade;
				
			}
			System.out.println("The maximum grade is " + maxGrade);
		}
	}
}