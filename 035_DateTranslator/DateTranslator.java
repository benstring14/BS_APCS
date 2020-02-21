import java.util.Scanner;

public class DateTranslator 
{
    public static void main(String args[]) 
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Day");
        int d = scan.nextInt();

        System.out.println("Enter Month");
        int m = scan.nextInt();

        System.out.println("Enter Year");
        int y = scan.nextInt(); //scans for day month and year

        System.out.println("american or european *ALL LOWER CASE*");
        String aOre = scan.next();
 // scans for version of date
        if (aOre.equals("american")) 
        {
            dateAmer(m, d, y);
           
            scan.close();
        } 
        if (aOre.equals("european")) 
        {
            dateEuro(d, m, y);
            
            scan.close();
        } //use if statements to use input for version and uses correct form of date
    }
    public static void dateAmer(int month, int day, int year) //custom method for american date
    {
        System.out.println("The American Version of the entered date is: " + month + "," + day + "," + year);
    }

    public static void dateEuro(int day, int month, int year) //custom method for european date
    //prints out sentence giving proper form
    {
        System.out.println("The European Version of the entered date is: " + day + "," + month + "," + year);
    }
}