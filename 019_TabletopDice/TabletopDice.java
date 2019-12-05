import java.util.Scanner;
public class TabletopDice
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        //Used math.random to generate a random number between 0-1
        double foo = Math.random();
        
        int d4 = (int)(foo*4 + 1);
        int d6 = (int)(foo*6 + 1);
        int d8 = (int)(foo*8 + 1);
        int d12 = (int)(foo*12 + 1);
        int d20 = (int)(foo*20 + 1);
        //Times number by respective sided die and add one to get a value, also cast as an integer to get a whole number
        System.out.println("What die would you like to roll? You can enter either 4, 6, 8, 10, 12, or 20");
        int num = scan.nextInt();
        int die = (int)(foo*num + 1);

        System.out.println(die);
    }
}