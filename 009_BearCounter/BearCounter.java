public class BearCounter
{
    public static void main(String[] args)
    {
      int bear = 0;
      System.out.println("There are " + bear + " bears at the beehive");
      bear++;
      System.out.println(bear + " bear arrives");
      bear++;
      System.out.println(bear + " bears arrive");
      bear++;
      System.out.println(bear + " bears arrive");
      bear--;
      System.out.println("One bear leaves, there are now " + bear + " bears at the beehive");
      bear--;
      System.out.println("Another bear leaves, there is now " + bear + " bear at the beehive");
      bear--;
      System.out.println("The last bear leaves, now there are " + bear + " bears at the beehive");
      //I used incriments and decrements (++ and --) to change the value of the int throughout the code, by one respetively each time

    }
}