public class GasPriceTracker
{
    //declares double and string
    private double gasPrice;
    private String gasType;

    public GasPriceTracker(double gasPrice, String gasType)
    {
        //initializes variables using this.
        this.gasPrice = gasPrice;
        this.gasType = gasType;
    }
    // two getters return the price for each type of gas
    public double getGasPrice() 
    {
        return this.gasPrice;
    }

    public String getGasType() 
    {
        return this.gasType;
    }
    public static void main(String[] args)
    {

    }
    
}