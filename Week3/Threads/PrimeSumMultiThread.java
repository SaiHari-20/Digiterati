/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week3.Threads;

/**
 *
 * @author Sai Hari
 */
import java.util.ArrayList;
import java.util.List;

class PrimeCalculator extends Thread {

    private int start, end;
    private long sum = 0;

    public PrimeCalculator(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
    }

    private boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public long getSum() {
        return sum;
    }
}

public class PrimeSumMultiThread {

    public static void main(String[] args) {
        int limit = 100;
        int numThreads = 4;
        int chunk = limit / numThreads;

        List<PrimeCalculator> threads = new ArrayList<>();
        for (int i = 0; i < numThreads; i++) {
            int start = i * chunk + 1;
            int end = (i == numThreads - 1) ? limit : start + chunk - 1;
            PrimeCalculator thread = new PrimeCalculator(start, end);
            threads.add(thread);
            thread.start();
        }

        long totalSum = 0;
        for (PrimeCalculator thread : threads) {
            try {
                thread.join();
                totalSum += thread.getSum();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Sum of prime numbers up to " + limit + " is: " + totalSum);
    }
}
