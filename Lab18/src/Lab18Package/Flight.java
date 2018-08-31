//Garrett Valentine 
//Flight Program 
  
package Lab18Package; 
  
public class Flight 
{ 
     
    private String Airline; 
    private int flightNumber; 
    private String originCity; 
    private String destinationCity; 
    private int departureTime; 
    private int flightTime; 
    private int passengers; 
     
     
    public Flight() 
    { 
        Airline = "N/A"; 
        flightNumber = 2; 
        originCity = "N/A"; 
        destinationCity = "N/A"; 
        flightTime = 0; 
        passengers = 0; 
        departureTime = 0; 
    } 
    public void setAirline(String aL)
    {
    	Airline = aL;
    }
    public String getAirline()
    {
    	return Airline;
    }
    
    public void setflightNumber(int fN)
    {
    	flightNumber = fN;
    }
    public int getFlightNumber()
    {
    	return flightNumber;
    }
    public void setOriginCity(String oC)
    {
    	originCity = oC;
    	
    }
    public String getOriginCity()
    {
    	return originCity;
    }
    public void setDestinationCity(String dC)
    {
    	destinationCity = dC;
    }
    public String getDestinationCity()
    {
    	
    	return destinationCity;
    }
    
    public void setFlightTime (int fT) 
    { 
        flightTime = fT; 
         
    } 
     
    public int getFlightTime() 
    { 
        return flightTime; 
    } 
     
    public void setPassengers(int p) 
    { 
        passengers = p; 
    } 
     
    public int getPassengers() 
    { 
        return passengers; 
    } 
     
    public void setDepartureTime(int dT) 
    { 
        departureTime = dT; 
    } 
     
    public int getDepartureTime() 
    { 
        return departureTime; 
    } 
     
    public String toString() 
    { 
        String temp = "Airline Name: " + Airline + "\nFlight Number: " + flightNumber + "\nOrigin City: " + originCity + "\nDestination City: " + destinationCity
        		+ "\nFlight Time: " + flightTime + " Minutes" + "\nPassengers: " + passengers + "\nDeparture Time: " + departureTime + " Minutes"; 
                 
         
        return temp; 
                 
                 
         
    } 
     
     
}     
     
     
     
     
     
     
     