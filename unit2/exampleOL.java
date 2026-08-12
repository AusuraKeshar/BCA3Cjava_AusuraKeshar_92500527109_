
// wajp for method overloading//
import java.util.Scanner;

class abc {
    void sum(int a, int b) {

        System.out.println("the sum is " + (1 + 2));
    }

    void sum(int a, int b, int c) {
        System.out.println("the sum is " + (1 + 2 + 3));
    }
}

    class exampleOL {
        public static void main(String[] args) {
            abc obj = new abc();
            obj.sum(0, 0);
            obj.sum(0, 0, 0);
        }
    }

