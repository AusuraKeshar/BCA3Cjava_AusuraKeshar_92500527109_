/* WRITE A JAVA PROGRAM TO SWAP TWO VARIABLES WITHOUT TEMP VARIABLE. */

import java.util.Scanner;

class EP3_2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int a, b;

        System.out.print("ENTER FIRST NUMBER: ");
        a = sc.nextInt();

        System.out.print("ENTER SECOND NUMBER: ");
        b = sc.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("AFTER SWAPPING:");
        System.out.println("A = " + a);
        System.out.println("B = " + b);
    }
}