/*
4 Write a java program to use Nested Interface
*/

interface Outer {
    interface Inner {
        void display();
    }
}

public class U3P14 implements Outer.Inner {
    public void display() {
        System.out.println("This is a nested interface.");
    }

    public static void main(String[] args) {
        U3P14 obj = new U3P14();
        obj.display();
    }
}
