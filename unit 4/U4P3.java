class Mythread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running......" + Thread.currentThread().getName());
        System.out.println("Thread priority: " + Thread.currentThread().getPriority());

    }

}

public class U4P3 {
    public static void main(String[] args) {
        Thread myThread = new Thread(new Mythread());

        myThread.setName("MythreadNM");
        myThread.setPriority(Thread.NORM_PRIORITY);
        myThread.start();

        System.out.println("Main Thread name : " + Thread.currentThread().getName());
        System.out.println("Main Thread priority :" + Thread.currentThread().getPriority());
    }

}