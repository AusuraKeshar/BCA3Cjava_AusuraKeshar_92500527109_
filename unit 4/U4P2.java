/*
2 Write a java program to create a thread using Runnable class .
*/

public class U4P2 implements Runnable {
    public void run() {
        System.out.println("Thread is running using Runnable interface.");
    }

    public static void main(String[] args) {
        U4P2 obj = new U4P2();
        Thread t = new Thread(obj);
        t.start();
    }
}
