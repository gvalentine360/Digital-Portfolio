package Lab17Package;  
  
   
  
   
  
public class Auto  
  
{  
  
    private String make;             //automobile manufacturer.  
  
    private String model;            //automobile type.  
  
    private int year;                //year automobile was built.  
  
    private double miles;            //number of miles driven by auto.  
  
    private double speed;            //speed of auto in miles per hour.  
  
      
  
      
  
    public Auto(String mk, String md, int y)  
  
    {  
  
          
  
        make = mk;  
  
        model = md;  
  
        year = y;  
  
        miles = 0;  
  
        speed = 0;  
  
          
  
    }  
  
      
  
    //set method for speed  
  
    public void setSpeed(double s)  
  
    {  
  
        speed = s;  
  
    }  
  
      
  
    //get method for speed  
  
    public double getSpeed()  
  
    {  
  
        return speed;  
  
    }  
  
      
  
    //get method for miles  
  
    public double getMiles()  
  
    {  
  
        return miles;  
  
    }  
  
      
  
    //method to display attributes of the auto object  
  
    public String toString()  
  
    {  
  
        String temp = "Make:" + make + "\nModel:" + model +  
  
                      "\nYear:" + year + "\nMileage:" + miles;  
  
        return temp;  
  
    }  
  
      
  
    //Method to calculate distance of a drive based on auto's speed  
  
    //and time driven in hours, as indicated by user of method  
  
    public double driveDistance(double h)  
  
    {  
  
        return speed * h;  
  
    }  
  
    //method to update miles driven on auto after a drive  
  
    public void adjustMiles(double m)  
  
    {  
  
        miles += m;  
  
    }  
  
    public boolean equals(Object c) 
    { 
        if(!(c instanceof Auto)) 
        { 
            return false; 
        } 
        else 
        { 
            Auto cC = (Auto)c; 
            if((make.equals(cC.make))  && (model.equals(cC.model)) && (year == cC.year)) 
            { 
                return true; 
                 
            } 
            else 
            { 
                return false; 
            } 
  
  
        } 
             
    } 
  
      
  
      
  
}  