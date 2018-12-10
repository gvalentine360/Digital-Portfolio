public class HelloWorld
{
	public static void main(String [] args)
	{
		System.out.println("Hello World!");

		int x = 9;
		while(x > 0)
		{
			System.out.print(x);
			x--;
		}
		System.out.println();
		
		for(int y = 2; y <=  7; y++)
		{	
			System.out.print(y);
			if(y != 7)
			{
				System.out.print(" 0 ");
			}

		}	
	
		System.out.println();
		
		int w = 4;
		
		do{
		System.out.print(w + " ");
		w += 5;
			
		}while(w < 25);
		System.out.println();
		
		int a = 111;
		while(a > 103)
		{
			System.out.print(a + " ");
			a--;
		}
		System.out.println();		
	}

}
