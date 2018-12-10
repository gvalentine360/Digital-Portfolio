//Garrett Valentine

import java.util.*;
import java.io.*;

public class Reader
{
    public static void main(String []args)
    {
        
        
        try{
            
             LinkedQueue <Character> queue = new LinkedQueue <Character>();
             
             FileOutputStream out = new FileOutputStream("input.txt", false);
              
             PrintWriter pw = new PrintWriter(out);
             
             Scanner scan = new Scanner(new File("challenge.html"));
             
             String line = "";
             
             
             while(scan.hasNext())
             {
                  boolean ampersand = false;
                  boolean apostrophe = false;
                  boolean tag = false;
                 
                 for(int i = 0; i < line.length(); i++)
                 {
                     
                     char c = line.charAt(i);
                    
                     if(c == ' ' || c == '.' || c == ',' || c == '"' || c == ':')
                     {
                        
                         if(!queue.isEmpty())
                         {
                            System.out.println(queue);
                            
                            pw.println(queue);
                            
                            while(!queue.isEmpty())
                             {
                                queue.dequeue();
                             }
                            
                         }
                         
                     }
                    
                     if(c == '<')
                     {
                         tag = true;
                     }
                     
                     if( c == '>')
                     {
                         tag = false;
                     }
                     
                     if(c == 39)
                     {
                         queue.enqueue(c);
                         apostrophe = true;
                     }
                 
                     if(c == '&')
                     {
                        ampersand = true;
                     }
                   
                     if(c < 'z' && c > 'A' && tag != true && ampersand != true || c >= '0' && c <= '9' && tag != true && ampersand != true)
                     {
                         queue.enqueue(c);
                         
                     }
                     
                     else
                     {
                         if(!queue.isEmpty() && apostrophe == false)
                         {
                             System.out.println(queue);
                             
                             pw.println(queue);
                             
                             
                             while(!queue.isEmpty())
                             {
                                 queue.dequeue();
                             }
                             
                         }
                     
                     }
                      
                     if(c == ';')
                     {
                         ampersand = false;
                        
                     }
                        
                 }
                 line = scan.nextLine();
                 
             }
             pw.close();
            
            
            
            
            
        }catch(FileNotFoundException e){
            
            System.out.println("File not found.");
        }
       
    }
    
}