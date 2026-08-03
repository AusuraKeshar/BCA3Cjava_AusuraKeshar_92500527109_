/* WRITE A JAVA PROGRAM THAT TAKES A NUMBER AS INPUT AND PRINTS ITS MULTIPLICATION TABLE UPTO 10. */

import java.util.Scanner;

class EP1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int num, i;

        System.out.print("ENTER NUMBER: ");
        num = sc.nextInt();

        System.out.println("TABLE: ");

        for(i = 1; i <= 10; i++)
        {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}