/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week3.Threads;

/**
 *
 * @author Sai Hari
 */
class HelloThread extends Thread {

    @Override
    public void run() {
        System.out.println("Hello, Java!");
    }

    public static void main(String[] args) {
        HelloThread thread = new HelloThread();
        thread.start();
    }
}
