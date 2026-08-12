// wajp for method overloading//
import java.util.Scanner;

class abc {
    void sum(int a, int b) {

        System.out.println("the sum is " + (1 + 2));
    }

    void sum(float x, float y,float z) {
        System.out.println("the sum is " + (10.5+20.5+9.5));
    }
}

    class exampleOL2 {
        public static void main(String[] args) {
            abc obj = new abc();
            obj.sum(0, 0);
            obj.sum(0, 0, 0);
        }
    }