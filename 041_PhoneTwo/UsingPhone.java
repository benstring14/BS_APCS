public class UsingPhone
{
    public static void main(String args[])
    {
        //creates new phone
        PhoneTwo phone = new PhoneTwo("black", true);
        PhoneTwo phone2 = new PhoneTwo();
        PhoneTwo phone3 = new PhoneTwo(128.0);
        
        System.out.println(phone);
        //pulls info from toString()
        phone.testConnect();
        //tests connection using testConnect method made in phone.java
    }
}