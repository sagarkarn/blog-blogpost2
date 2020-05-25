import java.util.Scanner

fun main(args: Array<String>) {
    var scanner = Scanner(System.`in`)
    print("Enter first numerator and denumenator")
    var n1 = scanner.nextInt()
    var d1 = scanner .nextInt()
    print("Enter second numerator and denumenator")
    var n2 = scanner.nextInt()
    var d2 = scanner .nextInt()

    var n3 = (n1 * d2) + (n2 * d1)
    var d3 = d1 * d2
    var gcd = 0
    var min = if(n3 < d3) n3 else d3
    for( x in 2..min ){
        if(n3 % x == 0 && d3 % x == 0){
            gcd = x
        }
    }
    if(gcd > 0){
        println("Sum: "+n3/gcd+"/"+d3/gcd)
    }
    else println("Sum: "+n3+"/"+d3)
}