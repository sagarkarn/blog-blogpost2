import java.util.Scanner

fun main(args: Array<String>) {
    var scanner = Scanner(System.`in`)
    print("Enter number: ")
    var num = scanner.nextInt()
    var reverse = 0
    while (num > 0){
        val rm = num % 10
        reverse = (reverse * 10) + rm
        num /= 10
    }
    println("reverse number: "+reverse)
}