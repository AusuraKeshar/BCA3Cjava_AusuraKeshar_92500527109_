import java.util.Scanner;

class Program6M{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, i, j;

        System.out.print("Enter number: ");
        n = sc.nextInt();

        for (i = n; i >= 1; i--) {

            for (j = 1; j <= n - i; j++)
                System.out.print(" ");

            for (j = 1; j <= i; j++)
                System.out.print("*");

            System.out.println();
        }
    }
}