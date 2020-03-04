import java.util.Scanner;
public class PantryShelf
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        FoodItem oreos = new FoodItem("oreos", 20, "Nabisco", false);
       System.out.println("How many oreos do you want to eat?");
       int i = scan.nextInt();
       oreos.setAmount(oreos.getAmount() - i);
       int newAm = oreos.getAmount();
       if(newAm >= 0)
       {
       System.out.println("You ate " + i + " items and now you have " + newAm);
       }
       else
       {
           System.out.println("You want to eat too many");
       }
    }
}