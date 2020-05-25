 package programjava;

import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Math mark: ");
        int mMark = scanner.nextInt();
        System.out.print("Enter Science mark: ");
        int sMark = scanner.nextInt();
        System.out.print("Enter English mark: ");
        int eMark = scanner.nextInt();
        scanner.close();

        boolean validate = false;

        if ((mMark >= 0 && mMark <= 100) 
                && (mMark >= 0 && mMark <= 100) 
                && (mMark >= 0 && mMark <= 100)) {

            validate = true;

        }
        
        if (validate) {
            int average = (mMark + sMark + eMark) / 3;
            if (average < 30) {
                System.out.println("Fail");
            } else if (average < 40) {
                System.out.println("Grade: C");
            } else if (average < 60) {
                System.out.println("Grade: B");
            } else {
                System.out.println("Grade: A");
            }
        }
        else{
            System.out.println("Wrong input");
        }
    }
}