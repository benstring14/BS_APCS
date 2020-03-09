public class UsingPhone
{
    public static void main(String args[])
    {
        //creates new phone
        Phone phone = new Phone("iPhone", "black" , 64.0, true);
        phone.testConnect();
        //tests connection using testConnect method made in phone.java
    }
}