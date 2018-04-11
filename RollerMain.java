package dndroll;
import java.util.Scanner;
import java.util.Random;

public class RollerMain 
{
	public static void main(String[] args)
	{
		final int[] DICE_TYPE = {4, 6, 8, 10, 12, 20};
		Random rollRandom = new Random();
		Scanner kb = new Scanner(System.in);
		int dieChoice = 0;
		int rollCount = 0;
		
		while(dieChoice >= 0 && dieChoice < 6) //Continue allowing rolls until a value out of array DICE_TYPE bounds is entered.
		{
			System.out.println("What die do you want to roll?");
			System.out.println("1. d4\n2. d6\n3. d8\n4. d10\n5. d12\n6. d20\n7. Quit");
			dieChoice = kb.nextInt()-1; //take value and decrement 1 to align with array indices.
			if(dieChoice >= 0 && dieChoice < 6)
			{
				System.out.println("How many would you like to roll?");
				rollCount = kb.nextInt();
				kb.nextLine(); //Flush scanner buffer.
					for(int i = 0; i < rollCount; i++)
					{
						System.out.printf("Roll %d: %d\n", i+1, rollRandom.nextInt(DICE_TYPE[dieChoice])+1); //return value, incremented by 1 to be in 1-n range.
					}
					System.out.println("Press enter to continue.");
					kb.nextLine(); //Take input from user so rolls do not slide off screen.
			}
		}
		kb.close();
	}
}
