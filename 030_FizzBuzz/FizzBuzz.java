import java.util.Scanner;
public class FizzBuzz
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
		System.out.println("Enter number to count to:");
		int n = scan.nextInt();
		System.out.println("Ready Set Go!");
        for (int i = 1; i <= n; i++)
        {
			if (i % 3 == 0 && i % 5 == 0) //divisible by 3 & 5
			{ 
				System.out.print("FizzBuzz");
			} 
			else if (i % 3 == 0) //divisible 3
			{ 
				System.out.print("Fizz");
			} 
			else if (i % 5 == 0) //divisible by 5
			{ 
				System.out.print("Buzz");
			} 
			else
			{
				System.out.print(i);
			}
			System.out.print(" ");
		}
		scan.close();
	}
}
    
