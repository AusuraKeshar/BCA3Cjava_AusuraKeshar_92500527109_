/*
1 Write a java program to use Interface in java
*/

interface Printable {
    void print();
}

public class U2P1 implements Printable {
    public void print() {
        System.out.println("Interface is implemented successfully.");
    }

    public static void main(String[] args) {
        U2P1 obj = new U2P1();
        obj.print();
    }
}
