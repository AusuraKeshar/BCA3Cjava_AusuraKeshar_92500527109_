/* WRITE A JAVA PROGRAM OF 1D ARRAY AND TAKE VALUES FROM USER. */

import java.util.Scanner;

class program10a
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int marks[] = new int[5];
        int i;

        System.out.println("ENTER MARKS OF 5 STUDENTS:");

        for(i = 0; i < marks.length; i++)
        {
            marks[i] = sc.nextInt();
        }

        System.out.println("MARKS OF 5 STUDENTS:");

        for(i = 0; i < marks.length; i++)
        {
            System.out.println(marks[i]);
        }
    }
}
