import java.util.Scanner

fun main(args: Array<String>) {
    var scanner = Scanner(System.`in`);
    System.out.print("Enter number: ");
    var number = scanner.nextInt();
    scanner.close();
    var next = 1;var prev = 0;var temp:Int;
    if(number == 1)
        print("0 ")
    else print("0 1 ")
    for(x in 0 until number - 2){
        print((next + prev).toString() + " ");
        temp = next + prev;
        prev = next;
        next = temp;
    }
}