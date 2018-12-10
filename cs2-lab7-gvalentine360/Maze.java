import java.util.*;
import java.io.*;



public class Maze
{
  public static void main(String[] args) throws InterruptedException
  {
        for (int i=10; i>=0; i--)
    {
      System.out.println(i);
      Thread.sleep(1000);
      System.out.print("\033\143");
    }
    
      try{
            Scanner scan = new Scanner(new File("mazeText.txt"));
            
            int cols = Integer.parseInt(scan.next());
            int rows = Integer.parseInt(scan.next());
            char[][] maze = new char[rows][cols];
            

     
     
      scan.nextLine();
      for(int row = 0; row < rows; row++)
      {
          String line = scan.nextLine();
          for(int col = 0; col < cols; col++)
          {
              maze[row][col] = line.charAt(col);
          }
      }
      
      for(int row = 0; row < rows; row++)
      {
          
          for(int col = 0; col < cols; col++)
          {
              System.out.print(maze[row][col]);
          }
          System.out.println();
      }
     
     
   
  


    
          
      }catch(FileNotFoundException e)
      {
          System.out.println("File not found");
      }
   
    

  }
}
