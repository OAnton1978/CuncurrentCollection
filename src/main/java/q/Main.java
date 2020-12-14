package q;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Main {
    static ConcurrentLinkedQueue<Long> callQueue = new ConcurrentLinkedQueue();
    static Runnable r = new ATS();
    static Runnable q = new Staff();
    static ThreadGroup mainGroup = new ThreadGroup("main group");
    static Thread ats = new Thread(mainGroup, r, "ats");
    static Thread staff = new Thread(mainGroup, q, "staff");

    public static void main(String[] args) throws InterruptedException {
        ats.start();
        staff.start();
        ats.join();
        staff.join();
    }
}
