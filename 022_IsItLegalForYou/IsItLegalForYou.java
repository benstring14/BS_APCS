import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;
public class IsItLegalForYou
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = scan.nextInt();
        //Used if statement to show what you can do at each age.
        if (age >= 18)
        {
            System.out.println("You are able to buy cigs, go to the nino");
        }
        if(age >= 16)
        {
        System.out.println("You can get a drivers licence");
        }
         if (age >= 25)
        {
            System.out.println("You can rent a car");
        }              
        if (age >= 21)
        {
            System.out.println("you can buy booze!!");
        }
        
       

        
    
       

                                                                       
    }
}