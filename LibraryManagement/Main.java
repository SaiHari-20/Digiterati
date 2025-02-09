/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibraryManagement;

/**
 *
 * @author Sai Hari
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LibraryManager libraryManager = new LibraryManager();
        Scanner scanner = new Scanner(System.in);

        // Adding Sample Books
        libraryManager.addBook(new Book("A Song of Ice and Fire", "George RR Martin", "12345"));
        libraryManager.addBook(new Book("Harry Potter", "JK Rowling", "67890"));

        // Adding Sample Users
        libraryManager.addUser(new User("Sai", "U1001"));
        libraryManager.addUser(new User("Hari", "U1002"));

        System.out.println("\nWelcome to Library Management System!");

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Borrow a Book");
            System.out.println("2. Return a Book");
            System.out.println("3. Reserve a Book");
            System.out.println("4. Search for a Book");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter User ID: ");
                    String borrowUserID = scanner.nextLine();
                    System.out.print("Enter Book ISBN: ");
                    String borrowISBN = scanner.nextLine();
                    try {
                        libraryManager.borrowBook(borrowISBN, borrowUserID);
                    } catch (Exception e) {
                        System.err.println("Error: " + e.getMessage());
                    }
                    break;

                case 2:
                    System.out.print("Enter User ID: ");
                    String returnUserID = scanner.nextLine();
                    System.out.print("Enter Book ISBN: ");
                    String returnISBN = scanner.nextLine();
                    try {
                        libraryManager.returnBook(returnISBN, returnUserID);
                    } catch (Exception e) {
                        System.err.println("Error: " + e.getMessage());
                    }
                    break;

                case 3:
                    System.out.print("Enter User ID: ");
                    String reserveUserID = scanner.nextLine();
                    System.out.print("Enter Book ISBN: ");
                    String reserveISBN = scanner.nextLine();
                    try {
                        libraryManager.reserveBook(reserveISBN, reserveUserID);
                    } catch (Exception e) {
                        System.err.println("Error: " + e.getMessage());
                    }
                    break;

                case 4:
                    System.out.print("Enter Book Title: ");
                    String searchTitle = scanner.nextLine();
                    Book foundBook = libraryManager.searchBook(searchTitle);
                    if (foundBook != null) {
                        System.out.println("Book Found: " + foundBook.getTitle() + " by " + foundBook.getAuthor());
                    } else {
                        System.err.println("Book Not Found!");
                    }
                    break;

                case 5:
                    System.out.println("Thank you for using the Library Management System! Exiting...");
                    scanner.close();
                    System.exit(0);

                default:
                    System.err.println("Invalid choice! Please enter a valid option.");
            }
        }
    }
}
