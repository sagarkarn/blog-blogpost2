package programjava;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = in.nextInt();
        in.close();
        int next = 1,prev = 0,temp;

        System.out.print("0 1 ");
        for(int i = 0; i < number - 2; i++){
            System.out.print((next + prev) + " ");
            temp = next + prev;
            prev = next;
            next = temp;
        }
    }
}