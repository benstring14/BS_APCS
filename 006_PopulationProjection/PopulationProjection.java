public class PopulationProjection
{
    public static void main(String[] args)
    {
        //In this program we combined our use of variables and mathematical equations to create a population projection over the next 5 years
        int birth = 7;
        int death = 13;
        int immigrant = 45;
        int currentPopulation = 312032486;
        int daysInYear = 365;
        int birthsPerYear = (((60 * 60 * 24 * daysInYear) / birth));
        int deathsPerYear = (((60 * 60 * 24 * daysInYear) / death));
        int immigrantPerYear = (((60 * 60 * 24 * daysInYear) / immigrant));
        int yearlyPopulation = (birthsPerYear + immigrantPerYear - deathsPerYear);
        System.out.println("Current Population = " + currentPopulation);
        System.out.println("Population After A Year = " + (currentPopulation + yearlyPopulation));
        System.out.println("Population After Two Years = " + (currentPopulation + (yearlyPopulation * 2)));
        System.out.println("Population After Three Years = " + (currentPopulation + (yearlyPopulation * 3)));
        System.out.println("Population After Four Years = " + (currentPopulation + (yearlyPopulation * 4)));
        System.out.println("Population After Five Years = " + (currentPopulation + (yearlyPopulation * 5)));
    
    }
}