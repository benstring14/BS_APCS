import java.util.Scanner;
public class ScrabbleCalculator
{
    int[] points = {1,2,3,4,5,8,10};
    public static void main(String[] args)
    {
        int[] points = {1,2,3,4,5,8,10};
        int[] box = {9,2,2,4,12,2,3,2,9,1,1,4,2,6,8,2,1,6,4,6,4,2,2,1,2,1};
        String[] alphabet = {"a", "b", "c", "d", "e",  
               "f", "g", "h", "i",
               "j",   "k", "l", "m", "n", "o", 
               "p", "q", "r", "s", "t",   "u", "v",
               "w", "x", "y", "z"};
        int[] totalNum = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};       
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.nextLine();
        int length = word.length();
        System.out.println(word);
        int totalPoints = 0;
        for(int i = 0; i<=length-1; i++)
        {
            String foo = word.substring(i,i+1);
            for (int j = 0; j < alphabet.length; j++ )
           {
            
           }

        }
        
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
           System.out.println(totalPoints);
    }
}