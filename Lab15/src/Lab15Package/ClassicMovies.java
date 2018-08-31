//Garrett Valentine
//Classic movies


package Lab15Package;
import java.util.Scanner;
import java.io.File;
import java.util.NoSuchElementException;
import java.io.FileNotFoundException;

public class ClassicMovies
{
	public static void main(String[]args)
	{
		try
		{
			Scanner file = new Scanner(new File("movies.txt"));
			
			while (! file.hasNext())
			{
				String movieTitle = file.nextLine();
				
				if( ! file.hasNextInt())
				{
					System.out.println("Invalid file format");
					String invalidData = file.nextLine();
				}	
				else
				{
				int runningTime = file.nextInt();
				String newLine = file.nextLine();
				System.out.println(movieTitle + "," + runningTime + "minutes");
					
				}
						
			 }	
				file.close();
			}
			catch (FileNotFoundException fnfe)
			{
				System.out.println("Unable to find movies.txt, exiting ");
				
			}
			catch (NoSuchElementException nsee)
			{
				System.out.println("Attempt to read past the end of the file");
			}
			catch (IllegalStateException ise)
			{
				System.out.println("Attempt to read after the file is closed");
				
			}
			
	
		}	
	}
