//Garrett Valentine 
//Multiplication Recursion 
  
package Lab27Package; 
  
import java.util.Scanner; 
  
public class MultiplicationRecursion 
{ 
    public static void main(String[]args) 
    { 
         
        Scanner scan = new Scanner(System.in); 
         
        System.out.println("Please input a integer"); 
         
        int integerOne = scan.nextInt(); 
         
        System.out.println("Please input another integer"); 
         
        int integerTwo = scan.nextInt(); 
         
         int results = addAsMult(integerOne, integerTwo);
         
         System.out.println(results);
         
    } 
     
    public static int addAsMult(int a , int b) 
    { 
         
        if(b == 1) 
        { 
        	
            return a; 
        } 
        else 
        { 
          
            return a + addAsMult(a, b-1); 
             
        } 
         
         
         
    } 
  
} 
  
 