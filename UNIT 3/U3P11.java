/*
1 Write a java program to use simple inner class in your program
*/

public class U3P11 {
    private String message = "This is the outer class.";

    class Inner {
        void display() {
            System.out.println(message);
            System.out.println("This is the simple inner class.");
        }
    }

    public static void main(String[] args) {
        U3P11 outer = new U3P11();
        U3P11.Inner inner = outer.new Inner();
        inner.display();
    }
}
