/*Garrett Valentine 
Bouncing Ball Program 
  
INSTRUCTIONS 
* This program will calculate the total distance a ball travels when it bounces. 
* Go to bouncedata.txt and input 3 integers one on each line to create a data set. 
* The first integer is your initial drop height. The second integer is the first bounce height, 
* and the third integer is the amount of times the ball bounces. 
* The program takes these three integers to determine the bouciness index,  
* and this determines the total distance the ball bounces. 
* if the distance of the ball becomes negligible, 
* the total distance display will be displayed and the bounces will stop even though all the bounces have not been reached 
* You can use as many data sets as you like. 
* After you input the data. Simply run the program.  
* The console will display the results. 
  
  
*  
*/ 
  
package BouncingBallPackage; 
  
import java.io.File; 
import java.util.Scanner; 
import java.util.NoSuchElementException; 
import java.io.FileNotFoundException; 
import java.text.DecimalFormat; 
  
public class BouncingBallProgram 
{ 
    public static void main(String[]args) 
    { 
         
     
     
         
         
        DecimalFormat decimal = new DecimalFormat("######0.00"); // formats numbers 
         
        try 
        { 
            File inputFile = new File("bouncedata.txt");            //data file 
            Scanner bounceFile = new Scanner(inputFile);            //Scanner that retrieves data from the file 
             
             
             
             
            while(bounceFile.hasNext())                             //while there is something on a line it will run this loop 
            { 
             
                 
                double dropHeight = bounceFile.nextDouble();        //the first number in the data file which is the drop height. 
                 
                double bounceHeight = bounceFile.nextDouble();        //the second number in the data file which is the bounce height. 
                 
                int bounces = bounceFile.nextInt(); 
                 
         
                double bouncinessIndex = bounceHeight / dropHeight;      //the bounce Height and drop Height divided which creates the bounciness index 
                 
                double bounceHeightIndex = bounceHeight*bouncinessIndex; //multiplies the bounce height and bounciness index. 
                 
                double dropHeightIndex = dropHeight*bouncinessIndex;     //multiplies the drop height and bounciness index. 
                 
                final double negligibleBounceDistance = 0.001;             //the negligible bounce distance which is set at 0.001. 
                 
                double distance = bounceHeight + dropHeight;             //the sum of bounce height and drop height creates the distance 
                 
                double distanceIndex = bounceHeightIndex + dropHeightIndex; //sum of bounceHeightIndex and dropHeightIndex to create distanceIndex 
                 
                int bouncesA = 1;    //Used for bounce counter 
                 
                 
                 
                System.out.println("\n-------------------------------- NEW DATA SET --------------------------------"); //New data set 
                 
                System.out.println("\nInitial drop height (in ft.): " + dropHeight + "\nFirst bounce height(in ft.): " + bounceHeight //Prints data 
                        + "\nCalculated Bounciness Index: " + decimal.format(bouncinessIndex) + "\nNumber of bounces: " + bounces) ; 
                 
                 
                 
                System.out.println("\nBounce: 1" + "\nDown: " + decimal.format(dropHeight)            //Prints the data 
                +" ft." +  "\nUp: " + decimal.format(bounceHeight) + " ft." +  "\nDistance: " + 
                decimal.format(distance) +" ft." + "\nTotal Distance: " + decimal.format(distance) + " ft."); 
                 
                     
                 
                    for(bounces = bounces; bounces > 1 ;bounces--) //A for loop that simulates a ball bouncing. 
                        { 
                         
                         
                     
                         
                     
                            distance+=dropHeightIndex; //adds drop height index to distance 
                         
                            distance+=bounceHeightIndex; // adds drop height index to distance 
                         
                         
                            bouncesA++; //adds 1 to bouncesA. Used as a bounce counter 
                 
                         
                            System.out.println("\nBounce: " + bouncesA + "\nDown: " + decimal.format(dropHeightIndex)  
                            +" ft." +  "\nUp: " + decimal.format(bounceHeightIndex) + " ft." +  "\nDistance: " +       //Prints data 
                            decimal.format(distanceIndex) +" ft." + "\nTotal Distance: " + decimal.format(distance) + " ft."); 
         
                         
                 
                            if(distanceIndex <= negligibleBounceDistance) // if distanceIndex is less than the negligible distance then the bounces will stop 
                            { 
                                bounces = 0; //Sets bounces to 0 which causes the for loop to stop. 
                                 
                                System.out.println("\nActual number of bounces: " + bouncesA); //Prints out the actual bounces. 
                                 
                            } 
                             
                            dropHeightIndex*=bouncinessIndex;           //Multiplies dropHeightIndex and bounciness index 
                             
                            bounceHeightIndex*=bouncinessIndex;         //Multiplies dropHeightIndex and bounciness index 
                             
                            distanceIndex = dropHeightIndex;            //Sets the distanceIndex equal to dropHeightIndex. 
                             
                            distanceIndex+= bounceHeightIndex;            //Adds the distanceIndex with bounceHeight index. 
                        }     
         
                 
                System.out.println("\nCalculated total distance of the ball: " + decimal.format(distance)+ " ft."); //Prints out total distance 
            } 
             
        } 
        catch(FileNotFoundException fnfe)        //Exception for when the file is not found. 
        { 
            System.out.println("File not found!");      
        } 
        catch(NoSuchElementException nsee)        //Exception for when the program attempts to read past the end of the file. 
        { 
            System.out.println("Attempt to read past the end of the file."); 
        } 
         
    } 
} 