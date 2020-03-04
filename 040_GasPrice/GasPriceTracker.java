public class GasPriceTracker
{
    
    private double gasPrice;
    private String gasType;

    public GasPriceTracker(double gasPrice, String gasType)
    {
        this.gasPrice = gasPrice;
        this.gasType = gasType;
    }
    
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