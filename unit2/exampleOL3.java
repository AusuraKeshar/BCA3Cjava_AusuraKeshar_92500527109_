// wajp for method overloading//
import java.util.Scanner;

class abc {
    void sum(int a, int b) {

        System.out.println("the sum is " + (a + b));
    }

    void sum(int a, int b, int c) {
        System.out.println("the sum is " + (a + b + c));
    }
}

    class exampleOL3 {
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int a,b,c;
            System.out.println("enter the value a1 ");
             a = scn.nextInt();
             System.out.println("enter the value b ");
             b = scn.nextInt();
             System.out.println("enter the value of c");
             c = scn.nextInt();
            abc obj = new abc();
            obj.sum(a, b);
            obj.sum(a, b, c);
        }
    }
