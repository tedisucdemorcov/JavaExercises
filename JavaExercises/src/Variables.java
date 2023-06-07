public class Variables {
    public static void main(String args[])
    {
//        print
        System.out.println("String: stores text");
        System.out.println("Int: stores integers, numbers");
        System.out.println("Float: stores floating points with decimals");
        System.out.println("Char: stores single characters, such as 'a' ");
        System.out.println("Boolean: stores value with 2 states, true / false");
// declaring variables, diffrent types
        String name = "Mihai";
        String account = "Personal";
        int number = 5;
        int first_number = 56;
        float larger = 45;
        double large = 1124.213;
        char letter = 'a';
        boolean select = true;
// print previos variables
        System.out.println(name);
        System.out.println(account);
        System.out.println(number);
        System.out.println(first_number);
        System.out.println(larger);
        System.out.println(large);
        System.out.println(letter);
        System.out.println(select);
// print with text and reacal variables.
        System.out.println("Name: " + name);
        System.out.println("Int exemple: " + number);
        System.out.println("Double exemple: "+ large);
        System.out.println("Char: " + letter);
        System.out.println("Boolean "+ select);

        int x = 5;
        String num = " number ";
        int z = 7;
        String sum = " + ";
        int y1 = 12;

        System.out.println(num + " " + x + " " + sum + " " + z + " = " + " " + y1  );

    }
}
