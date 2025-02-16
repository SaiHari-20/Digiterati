/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week3.Threads;

/**
 *
 * @author Sai Hari
 */
class MatrixMultiplier extends Thread {

    private int[][] A, B, C;
    private int row, col, size;

    public MatrixMultiplier(int[][] A, int[][] B, int[][] C, int row, int col, int size) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.row = row;
        this.col = col;
        this.size = size;
    }

    public void run() {
        for (int i = 0; i < size; i++) {
            C[row][col] += A[row][i] * B[i][col];
        }
    }
}

public class MatrixMultiplication {

    public static void main(String[] args) {
        int[][] A = {{1, 2}, {3, 4}};
        int[][] B = {{5, 6}, {7, 8}};
        int[][] C = new int[2][2];

        int size = A.length;
        Thread[][] threads = new Thread[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                threads[i][j] = new MatrixMultiplier(A, B, C, i, j, size);
                threads[i][j].start();
            }
        }

        try {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    threads[i][j].join();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Result Matrix:");
        for (int[] row : C) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
