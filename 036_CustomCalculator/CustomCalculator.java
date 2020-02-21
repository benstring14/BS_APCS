import java.util.Scanner;
public class CustomCalculator 
{
    public static double a;
    public static double b; 
    //Here i defined the doubles that will be user entered
    public static Scanner scan = new Scanner(System.in);
    public static void main(String args[]) 
    {

        System.out.println("If you would like to add enter '+', subtract enter '-', multiply enter 'x', divide enter '/', find perimeter of a rectangle enter 'p', area of a square enter 'as', Area of a rectangle 'ar', or to find quadratic derivative type 'deriv':");
        //Asked user what property/use of the calculator they would like to use
        String prop = scan.next();
       //Used if statements to call custom methods based on user input from intial question
        if (prop.equals("+")) 
        {
            scanTwo();
            add(a, b);
        } 
        else if (prop.equals("-")) 
        {
            scanTwo();
            subtract(a, b);
        } 
        else if (prop.equals("x")) 
        {
            scanTwo();
            multiply(a, b);
        } 
        else if (prop.equals("/")) 
        {
            scanTwo();
            divide(a, b);
        } 
        else if (prop.equals("p")) 
        {
            scanTwo();
            perimeter(a, b);
        } 
        else if (prop.equals("as")) 
        {
            scanOne();
            areaOfSquare(a);
        } 
        else if (prop.equals("ar")) 
        {
            scanTwo();
            areaOfRectangle(a, b);
        } else if (prop.equals("deriv")) 
        {
            scanDeriv();
            derivative(a, b);
        } else 
        {
            System.out.println("Your response was not recognized please try again");
            //If the typed response didnt equal any of the symbols (+,-,x,/, or the acronyms this response is printed)
        }
    }
    public static void add(double a, double b)
    {
        System.out.println(a + b);
    }
    public static void subtract(double a, double b) 
    {
        System.out.println(a - b);
    }
    public static void multiply(double a, double b) 
    {
        System.out.println(a * b);
    }
    public static void divide(double a, double b) 
    {
        System.out.println(a / b);
    }
    public static void perimeter(double a, double b)
    {
        System.out.println((a * 2) + (b * 2));
    }
    public static void areaOfSquare(double a) 
    {
        System.out.println((Math.pow(a, 2) ));
    }
    public static void areaOfRectangle(double a, double b) 
    {
        System.out.println(a * b);
    }
    public static void derivative(double a, double b) 
    {
        System.out.println(a * 2 +"x " + "+" + b);
    }
    //Voids that scan however many numbers are needed(1 or 2)... Deriv is custom for custom phrase printed before
    public static void scanOne() 
    {
        System.out.println("Type in the side length: ");
        a = scan.nextInt();
    }
    public static void scanTwo() 
    {
        System.out.println("Type in the first number: ");
        a = scan.nextInt();
        System.out.println("Type in the second number: ");
        b = scan.nextInt();
    }
    public static void scanDeriv() 
    {
        System.out.println("Form: Ax^2 + Bx + C");
        System.out.println("Enter the A value: ");
        a = scan.nextInt();
        System.out.println("Enter the B value: ");
        b = scan.nextInt();
    }
}