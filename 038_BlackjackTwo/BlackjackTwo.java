import java.util.Scanner;
public class BlackjackOne
{
    private Scanner scan = new Scanner(System.in);
    private int card1;
    private int card2;
    private int card3;
    private int dCard1;
    private int dCard2;
    private int dCard3;
    private int total = card1 + card2;
    private boolean playing = true;
    public CardDispenser ()
    {
        
    }
    public static void main(String[] args)
    {     

    }
    public void play()
    {
        start();
        while(playing)
        {
            hitOrStay();
            outcome();
        }

    }
  public void start()
  {
    card1 = generateCard();
    card2 = generateCard();
    System.out.println("You were dealt a " + card1 + " and a " + card2+ "." + "Your point total is" + total);

    dcard1 = generateCard();
    dcard2 = generateCard();
    int dTotal = dcard1 + dcard2;
    System.out.println("The dealer has a point total of " + dTotal);

  }
  public void generateCard()
  {
      double foo = Math.random() * 10 + 1;
      return (int) foo;
      

  }
  public void hitOrStay()
  {

  }
  public void outcome()
  {

  }
}