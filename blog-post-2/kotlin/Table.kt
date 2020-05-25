import java.util.Scanner

fun main(args: Array<String>) {
        var scanner = Scanner(System.`in`)
        System.out.print("Enter a number for print table: ")
        var num = scanner.nextInt()
        var table : Int
        for(x in 1..10){
            table = num * x
            println(num.toString() + " X "+x+" = "+table)
        }
}