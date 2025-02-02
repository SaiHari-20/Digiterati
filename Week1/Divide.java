
package Week1;

import java.util.Scanner;

public class Divide {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		sc.close();
		// check whether dividing by zero or not
		if (number2 == 0)
			System.out.println("Arithemtic Exception");
		// check whether numerator is less than denominator
		else if (number1 < number2)
			System.out.println("Quotient : "+ 0 + "\n" + "Remainder : " + number1);
		else
			divide(number1, number2);

	}
	// method to divide two numbers
	private static void divide(int number1, int number2) {
		int quotient = 0;
		int remainder;
		// check whether numerator is greater than or equal to denominator
		while (number1 >= number2) {
			number1 -= number2;
			quotient++;

		}
		remainder = number1;
		System.out.println("Quotient : " + quotient + "\n" + "Remainder : " + remainder);
	}

}
