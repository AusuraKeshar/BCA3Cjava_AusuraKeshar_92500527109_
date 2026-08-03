/* WRITE A JAVA PROGRAM TO SWAP TWO VARIABLES USING TEMP VARIABLE. */

import java.util.Scanner;

class EP3_1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int a, b, temp;

        System.out.print("ENTER 1st NUMBER: ");
        a = sc.nextInt();

        System.out.print("ENTER 2nd NUMBER: ");
        b = sc.nextInt();

        temp = a;
        a = b;
        b = temp;

        System.out.println("AFTER SWAPPING:");
        System.out.println("A = " + a);
        System.out.println("B = " + b);
    }
}