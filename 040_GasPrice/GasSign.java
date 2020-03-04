public class GasSign
{
    public static void main(String[] args)
    {
        GasPriceTracker unleaded = new GasPriceTracker(2.50, "unleaded");
        GasPriceTracker premium = new GasPriceTracker(3.00, "premium");
        GasPriceTracker plus = new GasPriceTracker(2.75, "plus");

        System.out.println(unleaded.getGasType() + ": $" + unleaded.getGasPrice());
        System.out.println(plus.getGasType() + ": $" + plus.getGasPrice());
        System.out.println(premium.getGasType() + ": $" + premium.getGasPrice());
    }
}