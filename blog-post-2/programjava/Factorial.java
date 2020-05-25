package programjava;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = in.nextInt();
        in.close();
        int factorial = 1;
        for(int i = 1; i<=number; i++ ){
            factorial *= i;
        }
        System.out.println(number+"! = "+factorial);
    }
}