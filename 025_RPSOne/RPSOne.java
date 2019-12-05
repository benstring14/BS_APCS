import java.util.Scanner;
public class RPSOne
{
  public static void main(String[] args)
  {
    
      Scanner scan = new Scanner(System.in);
      double comGen = Math.random();
      //if comGen is between 0. and .33 it equals rock, .33 to .67 = paper, .67 - 1 = scissors
      System.out.println("Rock");
      System.out.println("Paper");
      System.out.println("Scissors");
      System.out.println("Shoot!");
      System.out.println("R, P or S?");
      String choice = scan.nextLine();
    
      if (choice.equals("R") && comGen <= .33)
      {
          System.out.println("Rock");
         System.out.println("We Tied");
      }
      if (choice.equals("R") && comGen > .33 && comGen <= .67)
      {
          System.out.println("Paper");
          System.out.println("HAHAHA I WIN U LOSE");
          System.out.println("you suck lol");
      }
      if (choice.equals("R") && comGen <= 1 && comGen > .67)
      {
          System.out.println("Scissors");
          System.out.println("You win, im not even mad tho like whatever");
      }
        if (choice.equals("P") && comGen <= .33)
      {
          System.out.println("Rock");
         System.out.println("You win... ur bad tho");
      }
      if (choice.equals("P") && comGen > .33 && comGen <= .67)
      {
          System.out.println("Paper");
          System.out.println("boring.. we tied");
         
      }
      if (choice.equals("P") && comGen <= 1 && comGen > .67)
      {
          System.out.println("Scissors");
          System.out.println("I WIN BETTER LUCK NEXT TIME");
      }
        if (choice.equals("S") && comGen <= .33)
      {
          System.out.println("Rock");
         System.out.println("YES!!! I WIN LOSER");
      }
      if (choice.equals("S") && comGen > .33 && comGen <= .67)
      {
          System.out.println("Paper");
          System.out.println("Shoot! you cheated tho you put up scissors after me I should've won");
         
      }
      if (choice.equals("S") && comGen <= 1 && comGen > .67)
      {
          System.out.println("Scissors");
          System.out.println("we tied");
      }
  }
}
