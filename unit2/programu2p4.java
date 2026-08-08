//Wajp for dynamic inheritance//
import java.util.Scanner;

class Calculate {
    String name = "Calculate";
    int a, b;

    void addition() {
        System.out.println("addition is: " + (a + b));
    }

    void substraction() {
        System.out.println("substraction is: " + (a - b));
    }

    void multiplication() {
        System.out.println("multiplication is: " + (a * b));
    }

    void division() {
        System.out.println("division is: " + (a / b));
    }

    void module() {
        System.out.println("module is: " + (a % b));
    }
}

class UserInput extends Calculate {
    void ui() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number : ");
        a = sc.nextInt();
        System.out.println("Enter second number : ");
        b = sc.nextInt();
    }
}

public class programu2p4 {
    public static void main(String[] args) {
        UserInput ui = new UserInput();
        ui.ui();
        ui.addition();
        ui.substraction();
        ui.multiplication();
        ui.division();
        ui.module();

    }
}