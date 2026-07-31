/* Write a program for 2D Array using User Input */

import java.util.Scanner;

class Program11b {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int age[][] = new int[3][3];

        System.out.println("Enter 9 Elements:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                age[i][j] = sc.nextInt();
            }
        }

        System.out.println("------3x3------");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(age[i][j] + " ");
            }
            System.out.println();
        }
    }
}