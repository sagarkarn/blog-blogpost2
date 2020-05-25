package programjava;

import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        scanner.close();
        int temp = number;
        int count = 0;
        int result = 0;
        while(number > 0 ){
            count++;
            number = number/10;
        }

        number = temp;

        while(number > 0){
            final int reminder = number % 10;
            result += Math.pow(reminder, count);
            number /= 10;
        }
        if(temp == result){
            System.out.println("Armgstrong number");
        }
        else{
            System.out.println("Not armgstrong number");
        }
    }
}