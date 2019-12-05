public class FlipACoin
{
    public static void main(String[] args)
    {
        if (Math.random() < 0.5)
        //used Math.random to generate a number between 0 and 1, if its less than .5 its heads
        {
            System.out.println("Heads");
        }
        else
        //If more than .5, its heads
        {
            System.out.println("Tails");
        }
    }
}