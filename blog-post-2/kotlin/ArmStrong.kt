import java.util.Scanner

fun main(args: Array<String>) {
    var scanner = Scanner(System.`in`)
    print("Enter number: ")
    var number = scanner.nextInt()
    var temp = number
    var count = 0
    var result = 0
    while(number > 0 ){
        count++
        number = number/10
    }

    number = temp
    var reminder:Int
    while(number > 0){
        reminder = number % 10
        result = result.plus(Math.pow(reminder.toDouble(), count.toDouble())).toInt()
        number = number.div(10)
    }
    if(temp == result){
        println("Armgstrong number")
    }
    else{
        println("Not armgstrong number")
    }
}