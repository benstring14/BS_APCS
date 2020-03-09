public class FoodItem
{
    private String type;
    private int amount;
    private String brand;
    private boolean expired;
    //declares variables
    public FoodItem(String ttype, int aamount, String bbrand, boolean eexpired)
    //creates FoodItem class
    {
        type = ttype;
        amount = aamount;
        brand = bbrand;
        expired = eexpired;
    }
    //setters used to set value for each variable a part of fooditem class
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
    //getters return the entered values
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
    //tests whether food is expired or not
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

