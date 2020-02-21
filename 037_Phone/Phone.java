import javax.lang.model.util.ElementScanner6;
//Not finished
public class Phone 
{
    private String type;
    private String version;
    private double mem;
    private boolean connect;
    public Phone(String ttype, String vversion, double mmem, boolean cconnect)
    {
        type = ttype;
        version = vversion;
        mem = mmem;
        connect = cconnect;


    }
    public String getType() 
    {
        return type;
    }
    public String getVersion() 
    {
        return version;
    }
    public double getMem() 
    {
        return mem;
    }
    public boolean GetConnect() 
    {
        return connect;
    }
    public static void main(String[] args)
    {
        
    }
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
