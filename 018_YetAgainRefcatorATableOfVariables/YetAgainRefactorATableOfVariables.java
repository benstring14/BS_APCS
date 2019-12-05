import java.util.Scanner;

public class YetAgainRefactorATableOfVariables
{
    public static void main(String[] args)
    {
        //In this program we have the same result as ATableOfVariables, but we use a new method Math.pow to get these values
       //a 
       Scanner scan = new Scanner(System.in);
       int firstNumber = 1;
       int secondNumber = 2;
       int thirdNumber = 3;
       int fourthNumber = 4;
       //a^2
       double r2num1 = Math.pow(firstNumber, secondNumber);
       double r2num2 = Math.pow(secondNumber, secondNumber);
       double r2num3 = Math.pow(thirdNumber, secondNumber);
       double r2num4 = Math.pow(fourthNumber, secondNumber);
       //a^3
       double r3num1 = Math.pow(firstNumber, thirdNumber);
        double r3num2 = Math.pow(secondNumber, thirdNumber);
       double r3num3 = Math.pow(thirdNumber, thirdNumber);
       double r3num4 = Math.pow(fourthNumber, thirdNumber);


       System.out.println("a a^2  a^3");
       System.out.println(firstNumber + " " + r2num1 + "  " + r3num1);
       System.out.println(secondNumber + " " + r2num2 + "  " + r3num2);
       System.out.println(thirdNumber + " " + r2num3 + "  " + r3num3);
       System.out.println(fourthNumber + " " + r2num4 + " " + r3num4);
//Here i ask the user what new row he wants to add using Scanner
        System.out.println("What additional row of values would you like to see? ");
        int numba = scan.nextInt();
        int numbo = (numba -1);
// I subtract one because the first row is a a^2 a^3
        double rXnum1 = Math.pow(numbo, firstNumber);
        double rXnum2 = Math.pow(numbo, secondNumber);
        double rXnum3 = Math.pow(numbo, thirdNumber);
        //use the value entered in -1 and plug it into new doubles
        

        System.out.println("a a^2  a^3");
        System.out.println(firstNumber + " " + r2num1 + "  " + r3num1);
        System.out.println(secondNumber + " " + r2num2 + "  " + r3num2);
        System.out.println(thirdNumber + " " + r2num3 + "  " + r3num3);
        System.out.println(fourthNumber + " " + r2num4 + "   " + r3num4);
        System.out.println(rXnum1+ " " + rXnum2 + "  " + rXnum3);
//print out new row along with prior numbers



       
    }
}
