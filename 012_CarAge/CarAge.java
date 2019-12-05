public class CarAge
{
    public static void main(String[] args)
    {
        Car lamborghiniUrus = new Car(2020, 0, "lamborghini", "urus", false);
        Car eTron = new Car(2020, 0, "audi", "etron");
        Car teslaRoadster = new Car(2020, 0, "tesla", "roadster", false);
        Car fordTaurus = new Car(2004, 120000, "ford", "taurus", false);
        Car p1LM = new Car(2020, 0, "mclaren", "p1 lm", true);
        ReturningCalculator one = new ReturningCalculator();
        //I declared the returning calculator and called it "one"
        int year = 2020;
     
        int lamborghiniUrusAge = one.integerSubtractor(year, lamborghiniUrus.year);
        int eTronYear = one.integerSubtractor(year, eTron.year);
        int teslaRoadsterYear = one.integerSubtractor(year, teslaRoadster.year);
        int fordTaurusYear = one.integerSubtractor(year, fordTaurus.year);
        int p1LMYear = one.integerSubtractor(year, p1LM.year);
        //used the year of the car from Car class, and used method on returning calculator to subtract this year from int year which is 2020
        System.out.println("The Lamborghini is " + lamborghiniUrusAge + " years old.");
        System.out.println("The e Tron is " + eTronYear + " years old.");
        System.out.println("The Roadster is " + teslaRoadsterYear + " years old.");
        System.out.println("The taurus is " + fordTaurusYear + " years old.");
        System.out.println("The taurus is " + p1LMYear + " years old.");

    }
}