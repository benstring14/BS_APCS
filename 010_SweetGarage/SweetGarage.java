public class SweetGarage
{
    public static void main(String[] args)
    {
        Car lamborghiniUrus = new Car(2020, 0, "lamborghini", "urus", false);
        Car eTron = new Car(2020, 0, "audi", "etron");
        Car teslaRoadster = new Car(2020, 0, "tesla", "roadster", false);
        Car fordTaurus = new Car(2004, 120000, "ford", "taurus", false);
        Car p1LM = new Car(2020, 0, "mclaren", "p1 lm", true);
        //I used the custom class provided by Mr. Sobolewski
        //I entered the cars year, manufacturer name, model name, and miles driven
        System.out.println("The first car is a " + eTron.year + " " + eTron.manufacturerName + " " + eTron.modelName + " with " + eTron.milesDriven + " miles.");
        System.out.println("The second car is a " + lamborghiniUrus.year + " " + lamborghiniUrus.manufacturerName + " " + lamborghiniUrus.modelName + " with " + lamborghiniUrus.milesDriven + " miles.");
        System.out.println("The third car is a " + teslaRoadster.year + " " + teslaRoadster.manufacturerName + " " + teslaRoadster.modelName + " with " + teslaRoadster.milesDriven + " miles.");
        System.out.println("The fourth car is a " + fordTaurus.year + " " + fordTaurus.manufacturerName + " " + fordTaurus.modelName + " with " + fordTaurus.milesDriven + " miles.");
        System.out.println("The fifth car is a " + p1LM.year + " " + p1LM.manufacturerName + " " + p1LM.modelName + " with " + p1LM.milesDriven + " miles.");
        //Here i use the custom methods to rev the engine and to engage turbo on the p1LM
        p1LM.revEngine();
        p1LM.engageTurbo();
    }
}