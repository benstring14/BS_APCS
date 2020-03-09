public class PhoneTwo
{
    private String type;
    private String color;
    private double mem;
    private boolean connect;
    public PhoneTwo(String type, String color, double mem, boolean connect)
    {
        this.type = type;
        this.color = color;
        this.mem = mem;
        this.connect = connect;
    }
    public PhoneTwo()
    {
        type = "iPhone 11 Pro";
        color = "Seafoam Green";
        mem = 128.0;
        connect = true;
    }
    public PhoneTwo(String color, boolean connect)
    {
        type = "Nokia 3310";
        this.color = color;
        mem = 1.0;
        this.connect = connect;
    }
    public PhoneTwo(double mmem)
    {
        type = "iPhone 7";
        color = "Black";
        mem = mmem;
        connect = true;
    }

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
    public void testConnect()
    {
        if(connect)
        {
            System.out.println("that is connected");
        }
        else
        {
                System.out.println("You are no longer connected");
        }
    }
    public String toString() 
    {
        return ("You have a " + color + " " + type + " with " + mem + " gig of memory" );
    }
}