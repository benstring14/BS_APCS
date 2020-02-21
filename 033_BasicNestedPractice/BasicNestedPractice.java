import java.util.Scanner;
public class BasicNestedPractice 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        String letter;
        int row;
        int column;
        System.out.println("what character do you want to print?");
        letter = scan.next(); // get the character that user wants to use
        int len = letter.length();
        if (len > 1) 
        {
            System.out.println("ERROR: You may only enter 1 character. Please try again ex: 'a'");
            // creates an error if more than one character is entered
        }
        else
        {
            System.out.println("How many rows?");
            row = scan.nextInt();
            System.out.println("How many columns?");
            column = scan.nextInt();
            for (int i = 0; i < row; i++) //for loop to take user input for row and create that many rows
            {
                for(int x = 0; x < column; x++) // for loop to take user input for column and make that many collumns
                {
                    System.out.print(letter+" ");
                }
                System.out.println(" ");
            }
        }
        scan.close();
    }
}