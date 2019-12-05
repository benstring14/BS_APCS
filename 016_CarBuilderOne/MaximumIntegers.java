public class MaximumIntegers
{
    public static void main(String[] args)
    {
        Integer maxVal = Integer.MAX_VALUE;
        Integer minVal = Integer.MIN_VALUE;
        //used Integer.MAX_VALUE/MIN_VALUE to get Integers with the maximum value of an integer and minimum value
        System.out.println(maxVal);
        System.out.println(minVal);

        Integer yo = maxVal - 2146483647;
        Integer go = minVal - 2147482898;
        //subtracted value from max and min value to get values given in assignment
        System.out.println(yo);
        System.out.println(go);

    }
}