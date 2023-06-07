public class If_Else {
    public static void main (String args[])
    {
        int num1 = 12;
        int num2 = 15;
        int num3 = 23;
        int num4 = 50;
        int num5 = 91;

        boolean select = true;

        if (num1 > num2)
        {
            System.out.println(select);
        }
        else
        {
            System.out.println(num1 + " lower then " + num2);
        }


        if (num1 < num2 && num3 > num2)
        {
            System.out.println(select);
        }
        else
        {
            System.out.println("incorect!");
        }

        if (num4 < num5 && num4 > num2)
        {
            System.out.println(select);
        }

    }
}
