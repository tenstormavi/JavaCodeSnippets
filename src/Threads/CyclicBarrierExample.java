package Threads;

import java.util.concurrent.CyclicBarrier;
public class CyclicBarrierExample {
    public static void main(String[] args) {
        final int threadCount = 3;
        final CyclicBarrier barrier
                = new CyclicBarrier(threadCount, () -> System.out.println("Barrier action executed!"));
//        final CyclicBarrier barrier = new CyclicBarrier(threadCount, new Runnable() {
//            @Override
//            public void run() {
//                // This is the barrier action
//                System.out.println("Barrier action executed!");
//            }
//        });

        Runnable task = () -> {
            System.out.println(Thread.currentThread().getName() + " is waiting at the barrier");
            try {
                barrier.await(); // Threads wait at the barrier
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " has crossed the barrier");
        };

//        Runnable task = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println(Thread.currentThread().getName() + " is waiting at the barrier");
//                try {
//                    barrier.await(); // Threads wait at the barrier
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//                System.out.println(Thread.currentThread().getName() + " has crossed the barrier");
//            }
//        };


        for (int i = 0; i < threadCount; i++) {
            new Thread(task).start();
        }
    }
}
