import java.util.Scanner;

class abc {
    void sum(int a, int b) {

        System.out.println("the sum is " + (1 + 2));
    }
}
 class xyz extends abc{
    void sum(int a, int b) {
        System.out.println("the sum is " + (1 + 4));
    }
}


    class exampleORb {
        public static void main(String[] args) {
            xyz obj = new xyz();
            obj.sum(0, 0);
            obj.sum(0, 0);
        }
    }
