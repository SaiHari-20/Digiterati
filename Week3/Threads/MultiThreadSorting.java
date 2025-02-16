/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week3.Threads;

/**
 *
 * @author Sai Hari
 */
import java.util.Arrays;

class SortThread extends Thread {

    private final int[] arr;

    public SortThread(int[] arr) {
        this.arr = arr;
    }

    @Override
    public void run() {
        Arrays.sort(arr);
        System.out.println(Thread.currentThread().getName() + " sorted array: " + Arrays.toString(arr));
    }
}

public class MultiThreadSorting {

    public static void main(String[] args) {
        int[] arr1 = {5, 3, 8, 6, 2};
        int[] arr2 = {12, 15, 7, 9, 1};

        SortThread thread1 = new SortThread(arr1);
        SortThread thread2 = new SortThread(arr2);

        thread1.start();
        thread2.start();
    }
}
