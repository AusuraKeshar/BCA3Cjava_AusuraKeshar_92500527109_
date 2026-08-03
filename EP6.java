/* WRITE A JAVA PROGRAM TO GET A NUMBER FROM USER AND PRINT WHETHER IT IS POSITIVE OR NEGATIVE. */

import java.util.Scanner;

class EP6
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("ENTER A NUMBER: ");
        n = sc.nextInt();

        if(n > 0)
        {
            System.out.println("POSITIVE");
        }
        else
        {
            System.out.println("NEGATIVE");
        }
    }
}