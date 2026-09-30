/*
8. Write a java program to use Multiple inheritance using interface.
*/

interface A {
    void display();
}

interface B {
    void show();
}

public class U2P8 implements A, B {
    public void display() {
        System.out.println("Method of interface A.");
    }

    public void show() {
        System.out.println("Method of interface B.");
    }

    public static void main(String[] args) {
        U2P8 obj = new U2P8();
        obj.display();
        obj.show();
    }
}
