public class ForLoop {
    public static void main (String args[])
    {
        int i;
        for ( i =0; i<10; i++)
        {
            System.out.println("Number is: "+ i);
        }

        int first;
        first= 20;
        int j;
        j = 12;
        for (first =0; first < j ;first++ )
        {
            int sum = first +j;
            System.out.println("Sum i+j"+ " " + sum);
        }
        for (j = 0; j<10 ;j++ )
        {
            int dif = first - j;
            System.out.println("first -j is: "+ " "+ dif);
        }
    }
}
