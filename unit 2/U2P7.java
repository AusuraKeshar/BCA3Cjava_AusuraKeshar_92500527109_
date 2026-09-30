/*
7. Write a java program to use interface
*/

interface Calculator {
    int add(int a, int b);
}

public class U2P7 implements Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        U2P7 obj = new U2P7();
        int result = obj.add(10, 20);
        System.out.println("Addition = " + result);
    }
}
