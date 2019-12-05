import java.util.Scanner;
public class BlackjackOne
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double foo = Math.random();
        double poo = Math.random();
        double noo = Math.random();
        //Math.random generates a random number , then u cast this to an int and times it by 11 and add one so its 1-11
        int card1 = (int)(foo*11+1);
        int card2 = (int)(poo*11+1);
        int card3 = (int)(noo*11+1);
        int total = card1 + card2;
        System.out.println("Your card total is " + total);
        System.out.println("Would you like to hit or stay?");
        String answer = scan.nextLine();
        int total2 = total + card3;
        if (answer.equals("hit")) // if you hit You get another card added to your total than this if statement says if you bust or not
        {
            System.out.println("Your new value is " + total2);
            if (total2 > 21)
            {
                System.out.println("BUST!");
                
        
            }
            if (total2 == 21)
            {
                System.out.println("BLACKJACK");
            }
            if (total2 < 21)
            {
                System.out.println("You better hope I dont score more than " + total2);
            }
        }
        else if (answer.equals("stay"))
        {
            
            System.out.println("You better hope I dont score more than " + total);
        }
        double koo = Math.random();
        double joo = Math.random();
        int card11 = (int)(koo*11+1);
        int card22 = (int)(joo*11+1);
        int dealertotal = (card11 + card22);
        System.out.println("I got " + dealertotal); // dealers total generated
        if (answer.equals("stay")) // this if statement compares your value if you stay to that of the dealers and prints the result of the round
        {
            if (dealertotal > total)
            {
                System.out.println("House Wins.");
            }
            if (dealertotal < total && total < 21)
            {
                System.out.println("You Win.");
            }
            if (dealertotal == total)
            {
                System.out.print("House Wins.");
            }
            else if (total > 21)
            {
                System.out.println("YOU LOSE.");
            }
        }
        if (answer.equals("hit")) // if you hit this if statement compares your total to that of the dealers
        {
            if (dealertotal > total2)
            {
                System.out.println("House Wins.");
            }
            if (dealertotal < total2 && total2 < 21)
            {
                System.out.println("You Win.");
            }
            if (dealertotal == total2)
            {
                System.out.print("House Wins.");
            }
            else if (total > 21)
            {
                System.out.println("YOU LOSE.");
            }
        }

        
       
    }
}