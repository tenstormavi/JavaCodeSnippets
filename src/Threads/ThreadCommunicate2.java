/*
Consumer thread is informed immediately when the data production is over.
 */

package Threads;

class Producer2 extends Thread {
    StringBuffer sb;

    Producer2() {
        sb = new StringBuffer();
    }

    public void run() {
        synchronized(sb) {
            for(int i=1; i<=10; i++) {
                System.out.println("Appending...");
                sb.append(i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("Final SB: " + sb);
            sb.notify();
        }
    }
}

class Consumer2 extends Thread {
    Producer2 prod;

    Consumer2(Producer2 prod) {
        this.prod = prod;
    }

    public void run() {
        synchronized (prod.sb) {
            System.out.println("Consumer Started...");
            try {
                prod.sb.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Prod: " + prod.sb);
        }
    }
}

public class ThreadCommunicate2 {
    public static void main(String[] args) throws Exception {
        Producer2 obj1 = new Producer2();
        Consumer2 obj2 = new Consumer2(obj1);

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t2.start();
        t1.start();
    }
}
