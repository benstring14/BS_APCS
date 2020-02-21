import java.util.Scanner;
public class AbecedarianWords 
{
    public static void main(String[] args) 
    {
        String word;
        int abecedarian = 0;
        //this int will dertermine if the word is abecedarian
        Scanner scan = new Scanner(System.in);
        System.out.println("What word would you like to test?");
        word = scan.next();
        // sets string word to user input
        int length = word.length();
        for (int i = 0; i < length-1; i++)
        //for loop to see how many letters are in the word
        {
            String lettuce = word.substring(i,i+1);
            String letterman = (word.substring(i+1,i+2));
            if (lettuce.compareToIgnoreCase(letterman) < 0 )
            {
                abecedarian += 1;
            }
            else
            {
                abecedarian -= 10;
            }
            //subtracts 10 and this will cause the abecedarian to go negative, showing it is not an abecedarian word
        }
        if (abecedarian > 0 )
        {
            System.out.println("The word " + word + " is abecedarian");
        }
        else
        {
            System.out.println("The word " + word + " isn't abecedarian");
        }
        //results printed
        scan.close();
        //scanner closed
    }
}