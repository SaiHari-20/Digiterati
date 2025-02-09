/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibraryManagement;

/**
 *
 * @author Sai Hari
 */
class BookNotFoundException extends Exception {

    public BookNotFoundException(String message) {
        super(message);
    }
}

class UserNotFoundException extends Exception {

    public UserNotFoundException(String message) {
        super(message);
    }
}

class MaxBooksAllowedException extends Exception {

    public MaxBooksAllowedException(String message) {
        super(message);
    }
}

public class ExceptionDemo {
//Dummy Class
}
