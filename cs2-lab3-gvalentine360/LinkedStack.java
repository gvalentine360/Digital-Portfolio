public class LinkedStack<T> implements StackADT<T> {
  private LinearNode<T> top;  //A reference to the top of the stack
  private int count;       //The number of items on the stack

  //Constructor
  public LinkedStack() {
    count = 0;
    top = null;
    
  }

  public T pop() throws EmptyStackException {
    
    if(isEmpty())
      throw new EmptyStackException("Stack is empty.");
      
    T result = top.getElement();
    top = top.getNext();
    count--;
    
    //Removes and returns the top item on the stack
    return result;
  }

  public T peek() throws EmptyStackException {
    //Returns the first item in the list
    //currently not implemented
  
    
    T topResult = top.getElement();
   
    return topResult;
  }

  public void push (T element) {
    //Add this data to the top of the stack
    LinearNode<T> temp = new LinearNode<T>(element);
    temp.setNext(top);     //Set next field to head references
    top = temp;            //Set head to reference the new node
    count++;
  }

  public boolean isEmpty() {
    //TASK: return true if 0 items on the stack; false otherwise
    return count == 0;
  }

  public String toString() {
    //Returns the list contents as a String
    LinearNode<T> trav = top;
    String cat = "";
    while (trav != null)
    {
      cat = cat + trav.getElement().toString();
      trav = trav.getNext();
    }
    return cat;
  }
  
  public boolean contains(T element)
  {
    LinearNode<T> trav = top;
    
      boolean temp = false;
      
      while(trav != null)
      {

        if(trav.getElement().equals(element))
        {
          
          temp = true;
          
        }
       
        trav = trav.getNext();
        
      }
      
      return temp;
  
  }
  
  
  
}
