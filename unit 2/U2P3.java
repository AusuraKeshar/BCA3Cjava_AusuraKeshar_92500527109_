/*
3. Write a java program to perform simple inheritance.
*/

class Parent {
    void display() {
        System.out.println("This is the parent class.");
    }
}

public class U2P3 extends Parent {
    void show() {
        System.out.println("This is the child class.");
    }

    public static void main(String[] args) {
        U2P3 obj = new U2P3();
        obj.display();
        obj.show();
    }
}
