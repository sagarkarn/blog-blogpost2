package programjava;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number for print table: ");
        int num = scanner.nextInt();
        scanner.close();
        int table;
        for(int i = 1; i <= 10; i++){
            table = num * i;
            System.out.println(num +" X "+i+" = "+table);
        }
    }
}