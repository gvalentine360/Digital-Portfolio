//Garrett Valentine
//Train Schedule Program

package Lab21Package;

import java.util.Scanner;

public class TrainSchedule
{
	public static void main(String[]args)
	{
		
		Scanner scan = new Scanner(System.in);
		
		String [] TrainNumber = {"B30", "G21", "R32", "Z53", "M84"};
		String [] OriginCity = {"Bensonhurst", "Red Hook", "Brighton Beach", "Rockaway Park", "Sheepshead Bay"};
		String [] DestinationCity = {"Flushing" , "Flatbush" , "Bushwick", "Jackson Heights", "Forest Hills"};
		String [] DepartureTime = {"8:45AM", "10:15AM", "1:35PM", "2:40PM", "4:20PM"};
		
		System.out.println("Please input a train number 0,1,2,3 or 4.");
		
		boolean invalidInput = false;
		
		int inputNumber = scan.nextInt();
	
		if(inputNumber == 0)
		{
			System.out.println("Train Number: " + TrainNumber[0] + "\nOrigin City: " + OriginCity[0] +  "\nDestination City: "
					 + DestinationCity[0] + "\nDeparture Time: "  + DepartureTime[0]);
			invalidInput = true;
		}
		
		if(inputNumber == 1)
		{
			System.out.println("Train Number: " + TrainNumber[1] + "\nOrigin City: " + OriginCity[1] +  "\nDestination City: "
					 + DestinationCity[1] + "\nDeparture Time: "  + DepartureTime[1]);
			invalidInput = true;
		}
		
		if(inputNumber == 2)
		{
			System.out.println("Train Number: " + TrainNumber[2] + "\nOrigin City: " + OriginCity[2] +  "\nDestination City: "
					 + DestinationCity[2] + "\nDeparture Time: "  + DepartureTime[2]);
			invalidInput = true;
		}
		if(inputNumber == 3)
		{
			System.out.println("Train Number: " + TrainNumber[3] + "\nOrigin City: " + OriginCity[3] +  "\nDestination City: "
					 + DestinationCity[3] + "\nDeparture Time: "  + DepartureTime[3]);
			invalidInput = true;
		}
		if(inputNumber == 4)
		{
			
			System.out.println("Train Number: " + TrainNumber[4] + "\nOrigin City: " + OriginCity[4] +  "\nDestination City: "
					 + DestinationCity[4] + "\nDeparture Time: "  + DepartureTime[4]);
			invalidInput = true;
		}
		if(invalidInput == false)
		{
			System.out.println("That is not a valid input. Please input a train number between 0 and 4");
		}
	}
}

	



