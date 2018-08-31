//Garrett Valentine  
  
//Auto Demo program  
  
   
  
package Lab17Package;  
  
   
  
public class AutoDemo  
  
{  
  
    public static void main(String[]args)  
  
    {  
  
        //created an instance of a new Auto object  
  
        Auto theCar = new Auto("Ford","Focus",2007);  
         
        Auto theCar2 = new Auto("Ford","Focus", 2007); 
         
        Auto theCar3 = new Auto("Ford","Mustang", 1997); 
          
  
        //Display the attributes of the new object  
  
        System.out.println(theCar);  
  
          
  
        //set the speed of the new auto  
  
        //to max. Legal speed limit on interstate.  
  
        theCar.setSpeed(70);  
  
          
  
        //Check speed  
  
        double mySpeed = theCar.getSpeed();  
  
        System.out.println("Cruise control set at " + mySpeed + " mph.");  
  
          
  
        //drive for 2 hours, then note the mileage  
  
        double myTrip = theCar.driveDistance(2);  
  
        theCar.adjustMiles(myTrip);  
  
        System.out.println("Distance of trip: " + myTrip);  
  
        System.out.println("New odometer reading: " + theCar.getMiles());  
  
          
  
        //Do another trip at a slightly lower speed  
  
        theCar.setSpeed(68.4);  
  
        myTrip = theCar.driveDistance(4.4);  
  
        theCar.adjustMiles(myTrip);  
  
        System.out.println("Distance of trip: " + myTrip);  
  
        System.out.println("New odometer reading: " + theCar.getMiles());  
  
          
  
        //do yet another trip through a residential area.  
  
        theCar.setSpeed(34.9);  
  
        myTrip = theCar.driveDistance(0.5);  
  
        theCar.adjustMiles(myTrip);  
  
        System.out.println("Distance of trip: " + myTrip);  
  
        System.out.println("New odometer reading: " + theCar.getMiles());  
  
          
  
        //stop car  
  
        theCar.setSpeed(0);  
  
          
  
  
        System.out.println(theCar);  
  
         if(theCar.equals(theCar2)) 
         { 
             System.out.println("The two cars are the same."); 
              
         } 
         else 
         { 
             System.out.println("The two cars are not the same."); 
             
         } 
         if(theCar.equals(theCar3)) 
         { 
             System.out.println("The two cars are the same"); 
         } 
         else 
         { 
             System.out.println("The two cars are not the same"); 
         } 
          
  
          
  
          
  
          
  
          
  
          
  
          
  
    }//main  
  
}// auto demo  