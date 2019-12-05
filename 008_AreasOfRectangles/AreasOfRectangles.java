public class AreasOfRectangles
{
    public static void main(String[] args)
    {
        double oneWidth = 5.5;
        double oneHeight = 7.8;
        double rec1AreaInInches = (oneHeight * oneWidth);
        double twoWidth = 99.4;
        double twoHeight = 500.352;
        double rec2AreaInCentimeters = (twoHeight * twoWidth);
        double threeWidth = 75;
        double threeHeight = 800;
        double centimetersInAnInch = 2.54;
        double rec3AreaInCentimeters = ((threeWidth * centimetersInAnInch) * threeHeight);
        double fourWidth = 500029.75;
        double fourHeight = 90029384;
        double rec4AreaInInches = (fourWidth * (fourHeight / centimetersInAnInch));
        //I used doubles in this program to use numbers wiht decimals as variables along with operators to make conversion from cm to in and vice versa and to calculate area
        System.out.println("Area of Rectangle 1 =" + " " + rec1AreaInInches + " " + "in");
        System.out.println("Are of Rectangle 2 =" + " " + rec2AreaInCentimeters + " " + "cm");
        System.out.println("Area of Rectangle 3 =" + " " + rec3AreaInCentimeters + " " + "cm");
        System.out.println("Area of Rectable 4 =" + " " + rec4AreaInInches + " " + "in");
    }
}