//Garrett Valentine
//Output file program

package Lab16Package;

import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Random;
import java.io.File;
import java.io.FileNotFoundException;

public class OutputFile
{
	public static void main(String[]args)
	{
		try
		{
			FileOutputStream out = new FileOutputStream("numbers.txt", false);
			
			PrintWriter pw = new PrintWriter(out);
			
			Random rdm = new Random();
			
			int n = 0;
			
			while (n < 20)
			{
				int x = rdm.nextInt(100) + 1;
				pw.println(x);
				n++;
			} 
			
			pw.close();
		}
		
		catch (FileNotFoundException notFound)
		{
			System.out.println("File not created!");
		}
	}
}