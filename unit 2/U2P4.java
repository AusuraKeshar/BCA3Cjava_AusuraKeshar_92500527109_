/*
4. Write a java program to use multilevel inheritance.
*/

class Grandparent {
    void display() {
        System.out.println("This is the grandparent class.");
    }
}

class Parent extends Grandparent {
    void show() {
        System.out.println("This is the parent class.");
    }
}

public class U2P4 extends Parent {
    void print() {
        System.out.println("This is the child class.");
    }

    public static void main(String[] args) {
        U2P4 obj = new U2P4();
        obj.display();
        obj.show();
        obj.print();
    }
}
