package heap;

import java.io.*;

public class HeapTest
{
  public static void main(String [] args)
  {
    //Create the heap
    Heap h = new Heap();

    //Insert some items
    h.insert(new Integer(5),5);
    h.insert(new Integer(3),3);     //Original Values 5, 3 ,7 ,1 ,6, 2, 10
    h.insert(new Integer(7),7);     // New Values 4, 7, 3, 8 ,9 ,6 ,5
    h.insert(new Integer(1),1);
    h.insert(new Integer(6),6);
    h.insert(new Integer(2),2);
    h.insert(new Integer(10),10);

    System.out.println("Here is the heap: "+ h);

    System.out.println("getting ready to deplete the tree");
    
    //Remove what's on top
   // h.remove();
    System.out.println("Here is what's on top: "+h.peek());

    //See what is in the heap now
   // System.out.println(h);


    while (!h.isEmpty())
    {
      Object element = h.remove();
      System.out.println("Here is the heap: "+ h);
    }

  }
}
