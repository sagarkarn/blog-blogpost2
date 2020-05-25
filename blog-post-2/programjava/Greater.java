package programjava;

import java.util.Scanner;

public class Greater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1,num2,num3,gt;
        System.out.print("Enter three number: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();
        scanner.close();
        if(num1 > num2){
            gt = num1;
        }
        else if(num2 > num3){
            gt = num2;
        }
        else{
            gt = num3;
        }
        System.out.println("Greater number: "+gt);
    }
}