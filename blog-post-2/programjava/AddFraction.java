package programjava;

import java.util.Scanner;

public class AddFraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first numerator and denumenator");
        int n1 = scanner.nextInt();
        int d1 = scanner .nextInt();
        System.out.print("Enter second numerator and denumenator");
        int n2 = scanner.nextInt();
        int d2 = scanner .nextInt();
        scanner.close();

        int n3 = (n1 * d2) + (n2 * d1);
        int d3 = d1 * d2;
        int gcd = 0;
        int min = n3 < d3 ? n3 : d3;
        for(int i = 2; i <= min; i++ ){
            if(n3 % i == 0 && d3 % i == 0){
                gcd = i;
            }
        }
        if(gcd > 0){
            System.out.println("Sum: "+n3/gcd+"/"+d3/gcd);
        }
        else System.out.println("Sum: "+n3+"/"+d3);
    }
}