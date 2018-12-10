import java.util.Scanner;

public class CharStackTester{
  public static void main(String[] args)
{
    CharStack stack = new CharStack();


   
   
    stack.push ('a'); //stack = a
    stack.push ('b'); //stack = ba
    stack.push ('c'); //stack = cba
    
    
  
    
    //System.out.println("result from toString:"+stack);
    //stack.isEmpty();
    //stack.peek();
    stack.pop(); //shows c
    stack.pop();//shows b
    System.out.println(stack.pop()); //shows a
    
   
   //Scanner scan = new Scanner(System.in);
   
   //System.out.println("Please type in a parenthesized expression: ");
   
   //String expression = scan.nextLine();
   //int x = expression.length();
   //boolean error = false; // too many ')'
   
    //for(int c = 0; c < x; c++)
    //{
        //if(expression.charAt(c) == '(')
        //{
           // stack.push('(');
      //  }
       // if(expression.charAt(c) == ')')
       // {
          // if(!stack.isEmpty()){
             // stack.pop();
           // }else{
           //   error = true;
          //  }
       // }
   // }
   
   // if(!stack.isEmpty()){
     // System.out.println("Bad expression: too many left parens.");
     // return;
   // }
   // if(error){
    //  System.out.println("Bad expression: too many right parens.");
    //  return;
   // }
   // System.out.println("Properly parenthesized expression.");
    
    //Continue to test all other methods to make sure
    //they work as they should.
  }
  
}
