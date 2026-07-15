/*write a progarm for if,if,else if condition in java*/
import java.util.Scanner;

public class program7e{
    public static void main(String[] args) {

        int age = 12;

        if (age >= 18) {

            if (age >= 60) {
                System.out.println("You are a Senior Citizen.");
            }

            else if (age >= 18) {
                System.out.println("You are an Adult.");
            }

        }

    
    }
}