/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package LibraryManagement;

/**
 *
 * @author Sai Hari
 */
public interface ILibrary {

    void borrowBook(String ISBN, String userID) throws Exception;

    void returnBook(String ISBN, String userID) throws Exception;

    void reserveBook(String ISBN, String userID) throws Exception;

    Book searchBook(String title);

}
