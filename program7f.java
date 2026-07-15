
/*Write a program for if ,else if, else if, else if, else condition in java*/
import java.util.Scanner;

public class program7f {
    public static void main(String[] args) {

      int marks = 40;

        if (marks >= 90) {
            System.out.println("Grade A+");
        }
        else if (marks >= 80) {
            System.out.println("Grade A");
        }
        else if (marks >= 70) {
            System.out.println("Grade B");
        }
        else if (marks >= 35) {
            System.out.println("Grade C");
        }
        else {
            System.out.println("Fail");
        }
    }
}