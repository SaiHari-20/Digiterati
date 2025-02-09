/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibraryManagement;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sai Hari
 */
abstract class LibrarySystem implements ILibrary {

    protected List<Book> books = new ArrayList<>();
    protected List<User> users = new ArrayList<>();

    public abstract void addBook(Book book);

    public abstract void addUser(User user);
}
