/*
2 Write a java program to use Static Inner Class
*/

public class U3P12 {
    private static String message = "This is the outer class.";

    static class Inner {
        void display() {
            System.out.println(message);
            System.out.println("This is the static inner class.");
        }
    }

    public static void main(String[] args) {
        U3P12.Inner inner = new U3P12.Inner();
        inner.display();
    }
}
