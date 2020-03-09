import java.util.Scanner;
 
public class ScrabbleCalculator
{
    //created an array with the 7 different number values awarded to each letter
    int[] points = {1,2,3,4,5,8,10};
    public static void main(String[] args)
    {
        int[] points = {1,2,3,4,5,8,10};   
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word (ALL CAPS)");
        String word = scan.nextLine();
        //scans user input
        int length = word.length();
        //creates int out of word length
        System.out.println(word);
        int totalPoints = 0; // set total points to 0 so it can be added
       //used for loop to check each letter
        for(int i = 0; i<=length-1; i++)
        {
            
            String foo = word.substring(i,i+1);
            
            if (foo.equals("A") || foo.equals("E") || foo.equals("I") || foo.equals("O") || foo.equals("U") || foo.equals("L") || foo.equals("N") || foo.equals("S") || foo.equals("T") || foo.equals("R"))
            {
                totalPoints = totalPoints + points[0]; 
                
            }
            if (foo.equals("D") || foo.equals("G"))
            {
                totalPoints = totalPoints + points[1]; 
                
            }
            if (foo.equals("B") || foo.equals("C") || foo.equals("M") || foo.equals("P"))
            {
                totalPoints = totalPoints + points[2]; 
                
            }
            if (foo.equals("F") || foo.equals("H") || foo.equals("V") || foo.equals("W") || foo.equals("Y"))
            {
                totalPoints = totalPoints + points[3]; 
                
            }
            if (foo.equals("K"))
            {
                totalPoints = totalPoints + points[4]; 
                
            }
            if (foo.equals("J") || foo.equals("X"))
            {
                totalPoints = totalPoints + points[5]; 
                
            }
            if (foo.equals("Q") || foo.equals("Z"))
            {
                totalPoints = totalPoints + points[6]; 
                
            }
            
        }
    }
}
