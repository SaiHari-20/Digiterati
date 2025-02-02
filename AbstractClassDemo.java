/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week1;

/**
 *
 * @author Sai Hari
 */
abstract class Animal {

    // Abstract method
    abstract void makeSound();
}

class Dog extends Animal {

    //Overriding the abstract method makeSound()
    @Override
    void makeSound() {
        System.out.println("Dog is Barking");
    }
}

public class AbstractClassDemo {
	public static void main(String[] args) {
		//Creating an instance of Dog
		Animal dog = new Dog();
		//Calling the makeSound() method
		dog.makeSound();
	}
}
