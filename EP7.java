/* WRITE A JAVA PROGRAM TO TAKE THREE NUMBERS AND PRINT THE SMALLEST AND BIGGEST NUMBER. */

import java.util.Scanner;

class EP7
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int a, b, c;

        System.out.print("ENTER FIRST NUMBER: ");
        a = sc.nextInt();

        System.out.print("ENTER SECOND NUMBER: ");
        b = sc.nextInt();

        System.out.print("ENTER THIRD NUMBER: ");
        c = sc.nextInt();

        if(a >= b && a >= c)
        {
            System.out.println("BIGGEST = " + a);
        }
        else if(b >= a && b >= c)
        {
            System.out.println("BIGGEST = " + b);
        }
        else
        {
            System.out.println("BIGGEST = " + c);
        }

        if(a <= b && a <= c)
        {
            System.out.println("SMALLEST = " + a);
        }
        else if(b <= a && b <= c)
        {
            System.out.println("SMALLEST = " + b);
        }
        else
        {
            System.out.println("SMALLEST = " + c);
        }
    }
}