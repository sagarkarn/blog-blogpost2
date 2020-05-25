package programjava;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        boolean isLeapYear = false;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = in.nextInt();
        in.close();
        
        if(year % 4 == 0){
            isLeapYear = true;
            if(year % 100  == 0 && year % 400 != 0 ){
                isLeapYear = false;
            }
        }

        if(isLeapYear){
            System.out.println("leap year");
        }
        else{
            System.out.println("not leap year");
        }
    }
}
//create tax clculator