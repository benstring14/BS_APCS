public class RefactorATableOfVariables
{
    public static void main(String[] args)
    {
        //In this program we have the same result as ATableOfVariables, but we only have four variables that have specific numbers as their values, and for the rest of the variables i multiplied the variables with specific numbers respectfully
        
       int firstNumber = 1;
       int secondNumber = 2;
       int thirdNumber = 3;
       int fourthNumber = 4;
       int fifthNumber = firstNumber * firstNumber;
       int sixthNumber = firstNumber * firstNumber * firstNumber;
       int seventhNumber = secondNumber * secondNumber;
       int eigthNumber = secondNumber * secondNumber * secondNumber;
       int ninthNumber = thirdNumber * thirdNumber;
       int tenthNumber = thirdNumber * thirdNumber * thirdNumber;
       int eleventhNumber = fourthNumber * fourthNumber;
       int twelfthNumber = fourthNumber * fourthNumber * fourthNumber;
       System.out.println("a a^2 a^3");
       System.out.println(firstNumber + " " + " " + fifthNumber + " " +  " " +  " " + sixthNumber);
       System.out.println(secondNumber + " " +  " " + seventhNumber + " " +  " " +  " " + eigthNumber);
       System.out.println(thirdNumber + " " +  " " + ninthNumber + " " +  " " +  " " + tenthNumber);
       System.out.println(fourthNumber + " " +  " " + eleventhNumber + " " +  " " + twelfthNumber);
    }
}