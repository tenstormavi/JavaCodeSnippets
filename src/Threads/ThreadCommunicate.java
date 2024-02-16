/*
Consumer thread checks whether the data production is over or not in every 10 milliseconds.
 */

package Threads;

class Producer extends Thread {
    StringBuffer sb;
    boolean dataProdOver = false;

    Producer() {
        sb = new StringBuffer();
    }

    public void run() {
        for(int i=1; i<=10; i++) {
            sb.append(i);
            try {
                System.out.println("Appending...");
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        dataProdOver = true;
    }
}

class Consumer extends Thread {
    Producer prod;

    Consumer(Producer prod) {
        this.prod = prod;
    }

    public void run() {
        while(!prod.dataProdOver) {
//            System.out.println("Consumer Started...");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Prod: " + prod.sb);
    }
}

public class ThreadCommunicate {
    public static void main(String[] args) throws Exception {
        Producer obj1 = new Producer();
        Consumer obj2 = new Consumer(obj1);

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}
