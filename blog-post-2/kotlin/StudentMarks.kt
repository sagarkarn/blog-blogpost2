import java.util.Scanner

fun main(args: Array<String>) {
    var scanner = Scanner(System.`in`)
    print("Enter Math mark: ")
    var mMark = scanner.nextInt()
    print("Enter Science mark: ")
    var sMark = scanner.nextInt()
    print("Enter English mark: ")
    var eMark = scanner.nextInt()

    var validate = false;

    if ((mMark >= 0 && mMark <= 100) 
            && (mMark >= 0 && mMark <= 100) 
            && (mMark >= 0 && mMark <= 100)) {

        validate = true

    }
    
    if (validate) {
        var average = (mMark + sMark + eMark) / 3
        if (average < 30) {
            println("Fail")
        } else if (average < 40) {
            println("Grade: C")
        } else if (average < 60) {
            println("Grade: B")
        } else {
            println("Grade: A")
        }
    }
    else{
        println("Wrong input")
    }
}