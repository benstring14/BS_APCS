import java.util.*;

public class SimpleCounter
{
 
  public static void main(String [] args)
{
    Scanner Scan = new Scanner(System.in);
    int lastNumber = 0;
    

    System.out.println("Enter number to count up to: ");
    int num = Scan.nextInt();

    

    while( num>=lastNumber)//used while loop so if number entered is greater than or equal to 0 it will add one over and over until its equal to the number entered
    {
        System.out.println(lastNumber++);
        if(num == lastNumber)
    {
        System.out.println(num);
        break; //breaks after number equals number entered
    }
    }
    
}

}