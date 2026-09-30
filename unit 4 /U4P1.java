/*
1 Write a java program to create a thread using Thread Class
*/

public class U4P1 extends Thread {
    public void run() {
        System.out.println("Thread is running using Thread class.");
    }

    public static void main(String[] args) {
        U4P1 t = new U4P1();
        t.start();
    }
}
