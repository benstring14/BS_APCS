public class ComputeAnExpressionTwo
{
    public static void main(String[] args)
    {
        ReturningCalculator one = new ReturningCalculator();
        //Declared a new Returning calculator called one
        double x = 9.5;
        double y = 4.5;
        double z = 2.5;
        int h = 3;
        double q = 45.5;
        double n = 3.5;
        //Here i used returning calculator to multiply subtract and divide doubles and int defined respectively above

        double xy = one.doubleMultiplier(x, y);
        double zh = one.doubleMultiplier(z, h);
        double top = one.doubleSubtractor(xy, zh);
        double bottom = one.doubleSubtractor(q, n);
        double answer = one.divider(top, bottom);

        
        System.out.println("The answer is" + " " + answer);
    }
}

