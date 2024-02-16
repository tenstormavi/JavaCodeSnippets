/*
Program to show thread priorities.
 */

package Threads;

class TestClass extends Thread {
    int count = 0;
    public void run() {
        for (int i=1; i<= 10000; i++) {
            count++;
        }
        System.out.println("Thread Completed: " + Thread.currentThread().getName()
                + " with Priority: " + Thread.currentThread().getPriority());
    }
}

public class ThreadPriority {
    public static void main(String[] args) {
        TestClass obj = new TestClass();

        Thread t1 = new Thread(obj, "One");
        Thread t2 = new Thread(obj, "Two");

        t1.setPriority(2);
        t2.setPriority(Thread.NORM_PRIORITY);

        t1.start();
        t2.start();
    }
}
