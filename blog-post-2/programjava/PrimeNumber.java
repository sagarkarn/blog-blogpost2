package programjava;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number");
        int number = in.nextInt();
        boolean primeNumber = true;
        in.close();
        if (number != 2) {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    primeNumber = false;
                    break;
                }
            }
        }
        
        if (primeNumber) {
            System.out.println(number + " is prime number");
        } else {
            System.out.println(number + " is not prime number");
        }
    }
}