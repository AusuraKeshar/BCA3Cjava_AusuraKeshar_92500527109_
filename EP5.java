/* WRITE A JAVA PROGRAM TO PRINT NUMBERS BETWEEN 1 AND 100 DIVISIBLE BY 3, 5 AND BOTH. */

class EP5
{
    public static void main(String args[])
    {
        int i;

        System.out.println("DIVISIBLE BY 3:");
        for(i = 1; i <= 100; i++)
        {
            if(i % 3 == 0)
            {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n");

        System.out.println("DIVISIBLE BY 5:");
        for(i = 1; i <= 100; i++)
        {
            if(i % 5 == 0)
            {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n");

        System.out.println("DIVISIBLE BY BOTH 3 AND 5:");
        for(i = 1; i <= 100; i++)
        {
            if(i % 3 == 0 && i % 5 == 0)
            {
                System.out.print(i + " ");
            }
        }
    }
}