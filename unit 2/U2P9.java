/*
9. Write a java program to use method overriding
*/

class Parent {
    void display() {
        System.out.println("Method of parent class.");
    }
}

public class U2P9 extends Parent {
    @Override
    void display() {
        System.out.println("Method of child class.");
    }

    public static void main(String[] args) {
        U2P9 obj = new U2P9();
        obj.display();
    }
}
