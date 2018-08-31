//Garrett Valentine
//Reading a text file


package Lab15Package;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;




public class EchoFileData
{
	public static void main(String[]args) throws IOException
	{
		int number;
		
		File inputFile = new File("integersdata.txt");
		Scanner file = new Scanner(inputFile);
		
		while(file.hasNext())
		{
			number = file.nextInt();
			System.out.println(number);
			
		}
		System.out.println("End of file detected. Goodbye");
	}
}