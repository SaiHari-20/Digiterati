///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package Week3.Task1;
//
//import java.util.*;
//
///**
// *
// * @author Sai Hari
// */
//class Student {
//
//    String name;
//    int[] marks;
//
//    public Student(String name, int[] marks) {
//        this.name = name;
//        this.marks = marks;
//    }
//
//    public void totalAndAverage() {
//        int total = Arrays.stream(marks).sum();
//        int avg = Arrays.stream(marks).sum()/marks.length;
//        System.out.println("Total :" + total + ", Average : " + avg);
//    }
//
//}
//
//public class Task2 {
//
//    public static void main(String[] args) {
//              
//    }
//}
package Week3.Task1;

import java.util.*;

/**
 *
 * @author Sai Hari
 */
class Student {

    String name;
    int[] marks;

    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    // Method to calculate total and average
    public void totalAndAverage() {
        int total = Arrays.stream(marks).sum();
        int avg = total / marks.length;
        System.out.println("Total: " + total + ", Average: " + avg);
    }

    // Get total marks for sorting purposes
    public int getTotal() {
        return Arrays.stream(marks).sum();
    }

    // Override toString() for better output format
    @Override
    public String toString() {
        int total = getTotal();
        int avg = total / marks.length;
        return name + " - Total: " + total + ", Average: " + avg;
    }
}

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // List to store students
        List<Student> students = new ArrayList<>();

        System.out.println("Enter the number of students:");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 0; i < n; i++) {
            System.out.println("Enter student's name:");
            String name = scanner.nextLine();

            System.out.println("Enter the number of subjects:");
            int numSubjects = scanner.nextInt();
            int[] marks = new int[numSubjects];

            System.out.println("Enter the marks for " + numSubjects + " subjects:");
            for (int j = 0; j < numSubjects; j++) {
                marks[j] = scanner.nextInt();
            }
            scanner.nextLine(); // Consume newline

            students.add(new Student(name, marks));
        }

        // Sort students based on total marks (in descending order)
        students.sort((s1, s2) -> Integer.compare(s2.getTotal(), s1.getTotal()));

        // Display sorted students
        System.out.println("\nSorted Students based on total marks:");
        for (Student student : students) {
            student.totalAndAverage();
        }

        scanner.close();
    }
}
