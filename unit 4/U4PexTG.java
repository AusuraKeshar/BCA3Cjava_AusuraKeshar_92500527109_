public class U4PexTG {

    public static void main(String[] args) {

        ThreadGroup grp = new ThreadGroup("group1");

        Mythread m1 = new Mythread(grp, "thread1");
        Mythread m2 = new Mythread(grp, "thread2");
        Mythread m3 = new Mythread(grp, "thread3");

        m1.start();
        m2.start();
        m3.start();

        grp.stop();

        System.out.println("Active Counts in Group :" + grp.activeCount());
    }
}

class Mythread extends Thread {

    public Mythread(ThreadGroup g, String s) {
        super(g, s);
    }

    public void run() {
        System.out.println("Thread name, priority, thread group" + Thread.currentThread());
    }
}