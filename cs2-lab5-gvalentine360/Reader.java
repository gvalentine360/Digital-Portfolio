import java.util.*;
import java.io.*;

public class Reader
{
    public static void main(String []args)
    {
        
        
        try{
            
             Scanner scan = new Scanner(new File("simple.html"));
             
             String line = "";
             
             while(scan.hasNext())
             {
                 
                 line = scan.nextLine();
                 System.out.println(line);
                 
                 
                 
             }
            
            
            
            
            
        }catch(FileNotFoundException e){
        
            System.out.println("File not found.");
        }
        
        
       
    }
    
}