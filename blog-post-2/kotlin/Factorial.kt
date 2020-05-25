import java.util.Scanner

fun main(args: Array<String>) {
    var scanner = Scanner(System.`in`);
    print("Enter number: ");
    var number = scanner.nextInt();
    scanner.close();
    var factorial = 1;
    for(x in 1..number){
        factorial *= x;
    }
    println(number.toString() + "! = " + factorial);
}