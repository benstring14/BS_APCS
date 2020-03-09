
public class Phone 
{
    private String type;
    private String color;
    private double mem;
    private boolean connect;
    //declared variables
    public Phone(String ttype, String ccolor, double mmem, boolean cconnect)
    {
        type = ttype;
        color = ccolor;
        mem = mmem;
        connect = cconnect;
        //initialized variables
    }
//made getters to return the value
    public String getType() 
    {
        return type;
        
    }
    public String getColor() 
    {
        return color;
    }
    public double getMem() 
    {
        return mem;
    }
    public boolean getConnect() 
    {
        return connect;
    }
    public static void main(String[] args)
    {
        
    }
    //checks boolean and returns whether your connected or not
    public void testConnect()
    {
        if(connect)
        {
            System.out.println("Your phone is connected");
        }
        else
        {
                System.out.println("You are no longer connected");
        }
    }
}
