/*Write a Java program to accept a name and the number of times it should be printed from the user, then print the name using a do-while loop.*/
import java.util.Scanner;

public class Program6i{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("How many times do you want to print your name? ");
        int n = sc.nextInt();

        int i = 1;

        System.out.println("\nOutput:\n");

        do {
            System.out.println(i + ". " + name);
            i++;
        } while (i <= n);

        sc.close();
    }
}