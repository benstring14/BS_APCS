import java.util.Scanner;

public class ShippingCalculator
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double x = 3.5;
        double y = 5.5;
        double z = 8.5;
        double w = 10.5;
        System.out.println("How much does your package weight (lbs)");
        double weight = scan.nextDouble();
        if (weight > 0 && weight <= 1)
        {
            System.out.println("Your price is " + x + " dollars.");
        }
        else if (weight > 1 && weight <= 3) //Used else if to respond to the entered amount
        {
            System.out.println("Your price is " + y + " dollars.");
        }
        else if (weight > 3 && weight <= 10)
        {
            System.out.println("Your price is " + z + " dollars.");
        }
        else if (weight > 10 && weight <= 20)
        {
            System.out.println("Your price is " + w + " dollars.");
        }
        else if (weight > 20)
        {
            System.out.println("This package cannot be shipped");
        }
        else // used else to print Invalid input if value doesnt fall in any of the if/ else if statements
        {
            System.out.println("Invalid input");
        }

    }
}