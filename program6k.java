//write 2nd program//
import java.util.Scanner;
class program6k{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int i,j,k;
        System.out.print("Enter rows: ");
        int n = sc.nextInt();

        for (i = n; i >= 1; i--) {

            for ( j = n; j > i; j--) {
                System.out.print(" ");
            }

            for (k = 1; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}