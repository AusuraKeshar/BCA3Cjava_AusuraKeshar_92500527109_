/*
2. Write a java program to extend one interface into another interface
*/

interface A {
    void display();
}

interface B extends A {
    void show();
}

public class U2P2 implements B {
    public void display() {
        System.out.println("Method of interface A.");
    }

    public void show() {
        System.out.println("Method of interface B.");
    }

    public static void main(String[] args) {
        U2P2 obj = new U2P2();
        obj.display();
        obj.show();
    }
}
