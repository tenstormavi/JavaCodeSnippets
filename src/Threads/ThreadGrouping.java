/*
Creation of thread group and methods to act on the thread group.
 */

package Threads;
class Reservation implements Runnable {
    public void run() {
        System.out.println("I am reservation thread: " + Thread.currentThread().getName());
    }
}

class Cancellation implements Runnable {
    public void run() {
        System.out.println("I am cancellation thread: " + Thread.currentThread().getName());
    }
}

public class ThreadGrouping {
    public static void main(String[] args) {
        Reservation res = new Reservation();
        Cancellation can = new Cancellation();

        ThreadGroup tg = new ThreadGroup("First group");
        Thread t1 = new Thread(tg, res, "First thread of first group");
        Thread t2 = new Thread(tg, res, "Second thread of first group");

        ThreadGroup tg1 = new ThreadGroup(tg, "Second group");
        Thread t3 = new Thread(tg1, can, "Third thread of second group");
        Thread t4 = new Thread(tg1, can, "Fourth thread of second group");

        System.out.println("Parent of tg1: " + tg1.getParent());

        tg1.setMaxPriority(7);

        System.out.println("Thread group of t1: " + t1.getThreadGroup());
        System.out.println("Thread group of t3: " + t3.getThreadGroup());

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        System.out.println("Number of active threads in tg: " + tg.activeCount());
    }
}
