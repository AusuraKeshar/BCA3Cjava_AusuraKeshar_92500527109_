/*
6. Write a java program to use Abstract class
*/

abstract class Shape {
    abstract void draw();

    void display() {
        System.out.println("This is an abstract class.");
    }
}

public class U2P6 extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle.");
    }

    public static void main(String[] args) {
        U2P6 obj = new U2P6();
        obj.display();
        obj.draw();
    }
}
