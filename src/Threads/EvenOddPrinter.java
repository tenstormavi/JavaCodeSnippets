/*
Print even and odd number using two threads. One thread will print odd number and other one will be even number.
 */

package Threads;

public class EvenOddPrinter {
    private final int limit;
    private int number = 1;

    public EvenOddPrinter(int limit) {
        this.limit = limit;
    }

    public void printOddNumber() {
        synchronized (this) {
            while (number <= limit) {
                while (number % 2 == 0) { // If number is even, odd thread waits.
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        System.out.println("Thread interrupted: " + e.getMessage());
                    }
                }
                // Print the number if it is odd.
                // Check again if number has not surpassed limit before printing.
                if (number <= limit) {
                    System.out.println(Thread.currentThread().getName() + " " + number);
                    number++;
                }
                notify(); // Notify the even thread.
            }
        }
    }

    public void printEvenNumber() {
        synchronized (this) {
            while (number <= limit) {
                while (number % 2 != 0) { // If number is odd, even thread waits.
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        System.out.println("Thread interrupted: " + e.getMessage());
                    }
                }
                // Check again if number has not surpassed limit before printing.
                if (number <= limit) {
                    System.out.println(Thread.currentThread().getName() + " " + number);
                    number++;
                }
                notify(); // Notify the odd thread.
            }
        }
    }

    public static void main(String[] args) {
        EvenOddPrinter printer = new EvenOddPrinter(10);

        Thread t1 = new Thread(printer::printOddNumber, "Odd Thread");
        Thread t2 = new Thread(printer::printEvenNumber, "Even Thread");

        t1.start();
        t2.start();
    }
}
