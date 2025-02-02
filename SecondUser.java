/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week1;

/**
 *
 * @author Sai Hari
 */
public class SecondUser {

    //Private user variables
    private String name;
    private int age;

    //Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public SecondUser(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        //Creating objects of User class
        User user1 = new User("Hari", 21);
        User user2 = new User("Hari", 21);
        System.out.println(user1);

        //Creating objects of SecondUser class
        SecondUser secondUser1 = new SecondUser("Rolex", 21);
        SecondUser secondUser2 = new SecondUser("Rolex", 21);
        System.out.println(secondUser1);

        System.out.println(user1.equals(user2));
        System.out.println(secondUser1.equals(secondUser2));

        //Comparing hashcodes
        System.out.println("\nUser class hash codes:");
        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());

        System.out.println("\nSecondUser class hash codes:");
        System.out.println(secondUser1.hashCode());
        System.out.println(secondUser2.hashCode());
    }
}
