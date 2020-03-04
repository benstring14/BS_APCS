public class UsingPhone
{
    public static void main(String args[])
    {
        PhoneTwo phone = new PhoneTwo("iPhone", "black" , 64.0, true);
        PhoneTwo set = new PhoneTwo();
        PhoneTwo colorConnect = new PhoneTwo("White", false);
        PhoneTwo mem = new PhoneTwo(64.0);
        phone.testConnect();
    }
    public String toString()
    {
        return phone.getType() + " " + phone.getColor() + " " + phone.getMem() + " " + phone.getConnect();
    }
}