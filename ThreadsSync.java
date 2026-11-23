class Counter {
    int count = 0;
    public synchronized void increment() { count++; }
}

public class ThreadsSync {
    public static void main(String[] args) throws Exception {
        Counter c = new Counter();
        Runnable task = () -> {
            for (int i = 0; i < 10000; i++) c.increment();
        };
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start(); t2.start();
        t1.join(); t2.join();          // wait for both threads
        System.out.println("Final Count: " + c.count);
    }
}
