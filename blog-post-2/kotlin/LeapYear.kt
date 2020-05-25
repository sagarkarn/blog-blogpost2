import java.util.Scanner

fun main(args: Array<String>) {
    var isLeapYear = false;
        var scanner = Scanner(System.`in`)
        print("Enter year: ")
        var year = scanner.nextInt()
        scanner.close()
        
        if(year % 4 == 0){
            isLeapYear = true
            if(year % 100  == 0 && year % 400 != 0 ){
                isLeapYear = false
            }
        }

        if(isLeapYear){
            System.out.println("leap year")
        }
        else{
            System.out.println("not leap year")
        }
}