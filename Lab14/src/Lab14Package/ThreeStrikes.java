//Garrett Valentine

//Three Strikes

package Lab14Package;

public class ThreeStrikes

{

	public static void main(String[]args)

	{

		for(int outs = 1; outs <= 3; outs++)

		{

			for(int strike = 1; strike <= 3; strike++)

			{

				System.out.println("Strike: " + strike);

			}

			System.out.println("Out Number: "+ outs);

		}
		
		System.out.println("End of the inning.");

	}
}
