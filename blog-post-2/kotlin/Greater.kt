import java.util.Scanner

fun main(args: Array<String>) {
    var scanner = Scanner(System.`in`)
    var num1:Int;var num2:Int;var num3:Int;var gt:Int
    System.out.print("Enter three number: ")
    num1 = scanner.nextInt()
    num2 = scanner.nextInt()
    num3 = scanner.nextInt()
    
    gt = if(num1 > num2){
        num1
    }
    else if(num2 > num3){
        num2
    }
    else{
        num3
    }
    println("Greater number: "+gt)
    
}