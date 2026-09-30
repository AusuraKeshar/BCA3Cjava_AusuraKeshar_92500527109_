/*
3 Write a java program to use Local Inner Class
*/

public class U3P13 {
    void display() {
        class LocalInner {
            void show() {
                System.out.println("This is a local inner class.");
            }
        }

        LocalInner obj = new LocalInner();
        obj.show();
    }

    public static void main(String[] args) {
        U3P13 obj = new U3P13();
        obj.display();
    }
}
