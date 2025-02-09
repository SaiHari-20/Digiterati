/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibraryManagement;

/**
 *
 * @author Sai Hari
 */
class LibraryManager extends LibrarySystem {

    @Override
    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public synchronized void borrowBook(String ISBN, String userID) throws Exception {
        User user = findUser(userID);
        Book book = findBook(ISBN);
        if (book.isBorrowed()) {
            throw new Exception("Book is already borrowed.");
        }
        user.borrowBook(book);
        book.borrow();
    }

    @Override
    public synchronized void returnBook(String ISBN, String userID) throws Exception {
        User user = findUser(userID);
        Book book = findBook(ISBN);
        user.returnBook(book);
        book.returnBook();
    }

    @Override
    public void reserveBook(String ISBN, String userID) {
        System.out.println("Book reserved successfully.");
    }

    @Override
    public Book searchBook(String title) {
        return books.stream()
                .filter(book -> book.getTitle().equalsIgnoreCase(title))
                .findFirst().orElse(null);
    }

    private User findUser(String userID) throws UserNotFoundException {
        return users.stream()
                .filter(user -> user.getUserID().equals(userID))
                .findFirst()
                .orElseThrow(() -> new UserNotFoundException("User not found."));
    }

    private Book findBook(String ISBN) throws BookNotFoundException {
        return books.stream()
                .filter(book -> book.getISBN().equals(ISBN))
                .findFirst()
                .orElseThrow(() -> new BookNotFoundException("Book not found."));
    }
}
