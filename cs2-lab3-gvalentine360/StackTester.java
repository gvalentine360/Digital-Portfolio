public class StackTester {
  public static void main (String [] args) {
    LinkedStack<Character> ls = new LinkedStack<Character>();

   
    ls.push (new Character ('a'));
    ls.push (new Character ('b'));
    ls.push (new Character ('c'));
    System.out.println(ls.contains('a'));
    System.out.println(ls);
    System.out.println(ls.peek());
    
    
    if(!ls.isEmpty())
    {
      
      System.out.println(ls.pop());
     
   
    }
  
    
  }
  
}
