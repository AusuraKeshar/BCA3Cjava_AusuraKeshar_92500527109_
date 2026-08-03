/* WRITE A JAVA PROGRAM TO ACCEPT A NUMBER AND CHECK WHETHER THE NUMBER IS EVEN OR ODD.
   PRINTS 0 IF NUMBER IS ODD ELSE 1 IF NUMBER IS EVEN. */

import java.util.Scanner;

class EP4
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("ENTER A NUMBER: ");
        n = sc.nextInt();

        if(n % 2 == 0)
        {
            System.out.println(1);
        }
        else
        {
            System.out.println(0);
        }
    }
}