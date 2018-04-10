package dndroll;
import java.util.Scanner;
import java.util.Random;

public class RollerMain 
{
	public static void main(String[] args)
	{
		Random rollRandom = new Random();
		final int[] DICE_TYPE = {4, 6, 8, 10, 12, 20};
		int dieChoice = 0;
		int rollCount = 0;
		Scanner kb = new Scanner(System.in);
		while(dieChoice < 6)
		{
			System.out.println("What die do you want to roll?");
			System.out.println("1. d4\n2. d6\n3. d8\n4. d10\n5. d12\n6. d20\n7. Quit");
			dieChoice = kb.nextInt()-1; //take value and decrement 1 to align with array indices.
			if(dieChoice < 6)
			{
				System.out.println("How many would you like to roll?");
				rollCount = kb.nextInt();
				int[] result = new int[rollCount];
				for(int i = 0; i < rollCount; i++)
				{
					result[i] = rollRandom.nextInt((DICE_TYPE[dieChoice])+1); //return value, incremented by 1 to be in 1-20 range.
					System.out.print(result[i] + " ");
				}
				System.out.print("\n");
			}
		}
		kb.close();
	}
}
