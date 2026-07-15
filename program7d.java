/*write a program for if,if,else,else condition in java*/
import java.util.Scanner;

 class program7d {
    public static void main(String[] args) {

        int age = 13;

        if (age >= 18) {

            if (age >= 60) {
                System.out.println("You are a Senior Citizen.");
            } else {
                System.out.println("You are an Adult.");
            }

        } else {
            System.out.println("You are a Minor.");
        }

    }
}