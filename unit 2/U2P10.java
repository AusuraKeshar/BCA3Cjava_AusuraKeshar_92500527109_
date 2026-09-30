/*
10. Write a java program to perform overriding of abstract class
*/

abstract class Vehicle {
    abstract void start();
}

public class U2P10 extends Vehicle {
    @Override
    void start() {
        System.out.println("Vehicle starts with a key.");
    }

    public static void main(String[] args) {
        U2P10 obj = new U2P10();
        obj.start();
    }
}
