package Week1;

import java.util.Scanner;

public class TrailingZeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int noOfZeros = 0;
        //Sum the quotients of the number when divided by the multiples of 5
        for (int i = 5; i <= num; i *= 5) {
            noOfZeros += num / i;
        }
        System.out.println(noOfZeros);
    }

}
