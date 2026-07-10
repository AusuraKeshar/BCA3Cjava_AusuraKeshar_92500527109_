/*Write a Java program to accept a name from the user and print it 10 times using a for loop.*/
import java.util.Scanner;

public class Program6b{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("\nYour name printed 10 times:\n");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + ". " + name);
        }

        sc.close();
    }
}