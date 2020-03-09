import java.util.Scanner;
public class PantryShelf
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        FoodItem oreos = new FoodItem("oreos", 20, "Nabisco", false);
        //creates food item using fooditem class
       System.out.println("How many oreos do you want to eat?");
       int i = scan.nextInt();
       //scans for how many oreos you want to eat
       oreos.setAmount(oreos.getAmount() - i);
       int newAm = oreos.getAmount();
       if(newAm >= 0)
       //if statement that ensures that there are still more than 0 cookies (Cant have negative cookies)
       {
       System.out.println("You ate " + i + " items and now you have " + newAm);
       }
       else
       {
           System.out.println("You want to eat too many");
       }
    }
}