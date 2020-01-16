public class PowerAttack
{
    public static void main(String[] args)
    {
        int strenNum = 3;
        double randyNum = Math.random();
        int genNum = (int)(randyNum*10+1);
        int totalAttack = genNum + strenNum;
        if(totalAttack >= 11)
        {
            System.out.println("You dealt " + totalAttack + " damage points on your ax swing.");
        }
        if(totalAttack < 11)
        {
            System.out.println("Your damage points did not exceed the monster's armor class.");
        }
    }
}