import java.util.*;

public class SimpleCounter
{
 
  public static void main(String [] args)
{
    Scanner Scan = new Scanner(System.in);
    int lastNumber = 0;
    

    System.out.println("Enter number to count up to: ");
    int num = Scan.nextInt();

    

    while( num>=lastNumber)
    {
        System.out.println(lastNumber++);
        if(num == lastNumber)
    {
        System.out.println(num);
        break;
    }
    }
    
}

}