//write a program for etting user input for printing *** in 1st order//
import java.util.Scanner;

class program6j {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i,j;
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        for (i = 1; i <= rows; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
        }
        System.out.println(" ");
           
    

        
    }
}