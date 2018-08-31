//Garrett Valentine

//Market Share

package Lab16Package;

import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class Shares
{
	public static void main(String[]args)
	
	{

		try

		{

			FileOutputStream out = new FileOutputStream("shares.txt", false);

			PrintWriter pw = new PrintWriter(out);

			int companies = 0;

			while(companies < 7)

			{

				Scanner scan = new Scanner(System.in);

				System.out.println("Please input the soft drink brand, and then the market share percentage");
				
				String brand = scan.nextLine();

				double share = scan.nextDouble();

				pw.println(brand);

				pw.println(share);

				companies++;

			}

			pw.close();

		}
		
		catch(FileNotFoundException notFound)

		{

			System.out.println("File not created!");

		}
	}
}
		
		