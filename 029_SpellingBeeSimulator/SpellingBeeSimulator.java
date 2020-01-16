import java.util.Scanner;
public class SpellingBeeSimulator
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("What word is next in the spelling bee?");
        String word = scan.nextLine();
        
        int length = word.length();
        
        System.out.print(word + ". " + word + " is spelled ");
        for(int i = 0; i<=length-1; i++)
        {
            String foo = word.substring(i,i+1);
            System.out.print(foo);
            if(i < length-1)
            {
                System.out.print("-");
            }
            
        }
        System.out.println(" ");
        

        
        
        
    }
}