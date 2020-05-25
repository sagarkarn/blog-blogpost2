import java.util.Scanner

fun main(args: Array<String>) {
    var scanner = Scanner(System.`in`)
    print("Enter number ")
    var number = scanner.nextInt()
    var primeNumber = true
    if (number != 2) {
        for (x in 2..number / 2) {
            if (number % x == 0) {
                primeNumber = false
                break
            }
        }
    }
    if (primeNumber) {
        println(number.toString() + " is prime number")
    } else {
        println(number.toString() + " is not prime number")
    }
}
