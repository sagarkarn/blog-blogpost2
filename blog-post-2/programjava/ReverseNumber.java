package programjava;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = scanner.nextInt();
        scanner.close();
        int reverse = 0;
        while (num > 0){
            final int rm = num % 10;
            reverse = (reverse * 10) + rm;
            num /= 10;
        }
        System.out.println("reverse number: "+reverse);
    }
}