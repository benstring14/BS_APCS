import java.util.Scanner;

public class LoanCalculator
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your principal balance: ");
        double principalBalance = scan.nextDouble();
        //Here I used Scanner to scan for the double entered in the console
        System.out.println("Enter your annual interest rate: ");
        double annualInterestRate = scan.nextDouble();
        System.out.println("Enter the remaining months: ");
        int remainingMonths = scan.nextInt();
        //Here the program takes the scanned values and entered them into these equations to calculate monthly interest and monthly payment
        double monthlyInterest = principalBalance * (annualInterestRate/remainingMonths);
        double monthlyPayment = principalBalance/remainingMonths + monthlyInterest;
        System.out.println("The monthly interest is " + monthlyInterest + " and the monthly payment is " + monthlyPayment);
        scan.close();
        //Close scanner once complete

    }

}