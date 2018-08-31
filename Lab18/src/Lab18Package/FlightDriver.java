//Garrett Valentine 
//Tests Flight class 
  
package Lab18Package; 
  
public class FlightDriver 
{ 
     
     
     
    public static void main(String[]args) 
    { 
        Flight theFlight = new Flight(); 
         
        System.out.println(theFlight); 
         
        theFlight.setDepartureTime(15); 
        theFlight.setAirline("Bolivar Airlines");
        theFlight.setflightNumber(3);
        theFlight.setOriginCity("Bolivar");
        theFlight.setDestinationCity("Springfield");
        theFlight.setPassengers(67); 
        theFlight.setFlightTime(20);
        
        int departureTimeA = theFlight.getDepartureTime();
        String Airline = theFlight.getAirline();
        int flightNumber = theFlight.getFlightNumber();
        String OriginCity = theFlight.getOriginCity();
        String DestinationCity = theFlight.getDestinationCity();
        int currentPassengersA = theFlight.getPassengers();
        int tripTimeA = theFlight.getFlightTime();
        
         System.out.println("--------------------------------------");
         
         System.out.println(theFlight);
       
        
 
         
         
         
    } 
} 
 