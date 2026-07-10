/*Write a Java program to accept a name from the user and print it 10 times using a while loop.*/
import java.util.Scanner;

public class Program6e{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        int i = 1;

        System.out.println("\nYour name printed 10 times:\n");

        while (i <= 10) {
            System.out.println(i + ". " + name);
            i++;
        }

        sc.close();
    }
}