/* Write a program to get a name from user and display on screen. */

import java.util.Scanner;

public class program2
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);

        System.out.println("ENTER A STRING:");
        String userInputString = scn.nextLine();

        System.out.println("ENTER AN INTEGER:");
        int userInputInt = scn.nextInt();

        System.out.println("You entered String: " + userInputString);
        System.out.println("You entered Integer: " + userInputInt);

        scn.close();
    }
}