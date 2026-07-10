/*Write a Java program to accept a name and the number of times it should be printed from the user, then print the name using a for loop.*/
import java.util.Scanner;

public class Program6c{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("How many times do you want to print your name? ");
        int n = sc.nextInt();

        System.out.println("\nOutput:\n");

        for (int i = 1; i <= n; i++) {
            System.out.println(i + ". " + name);
        }

        sc.close();
    }
}