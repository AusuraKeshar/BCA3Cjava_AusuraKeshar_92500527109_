/* write a program for 2D array */
import java.util.Scanner;

class Program11c {

    public static void main(String[] args) {

        // Assign value by set
        int age[][] = {
            {5, 10, 15},
            {20, 25, 30},
            {35, 40, 45}
        };

        System.out.println("---3x3 Array---");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(age[i][j] + " ");
            }
            System.out.println();
        }
    }
}