import java.util.Scanner;

public class CarBuilderOne
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter in the manufacturer of car you want: ");
        String manufac = scan.nextLine();
        //used scanner to scan for responses to my prompts
        System.out.println("Please enter the model of " + manufac + " you would like");
        String model = scan.nextLine();
        System.out.println("Please enter in what year you want your car from: ");
        int year = scan.nextInt();
        System.out.println("Please enter in what mileage you would like the car to have: ");
        int mileage = scan.nextInt();
        //used the responses and stored them in the car object
        Car noo = new Car(year, mileage, manufac, model, true); 
        System.out.println("Here is your new " + noo.year + " " + noo.manufacturerName + " " + noo.modelName + " with " + noo.milesDriven + " miles.");
        //pulled the values from the car objext to make a statement
        scan.close();
    }
}
