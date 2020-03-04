public class FoodItem
{
    private String type;
    private int amount;
    private String brand;
    private boolean expired;
    public FoodItem(String ttype, int aamount, String bbrand, boolean eexpired)
    {
        type = ttype;
        amount = aamount;
        brand = bbrand;
        expired = eexpired;
    }
    public void setType(String ttype) 
    {
        type = ttype;
        
    }
    public void setAmount(int aamount) 
    {
        amount = aamount;
    }
    public void setBrand(String bbrand) 
    {
        brand = bbrand;
    }
    public void ifExpired(boolean eexpired) 
    {
        expired = eexpired;
    }
    public static void main(String[] args)
    {
        
    }
    public String getType()
    {
        return type;
    }
    public int getAmount()
    {
        return amount;
    }
    public String getBrand()
    {
        return brand;
    }
    public boolean getExpired()
    {
        return expired;
    }
    public void testExpire()
    {
        if(expired)
        {
            System.out.println("Your food is expired");
        }
        else
        {
                System.out.println("Your food is not expired");
        }
    }
}

