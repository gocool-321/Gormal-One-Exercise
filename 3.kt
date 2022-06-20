import java.util.* //For Input
fun main() {
    var reader = Scanner(System.`in`) //Obj for scanner
    println("Enter Number-1: ") //Input - 1
    val number1 = reader.nextInt() //reading
    println("Enter Number-2: ") // Input -2
    val number2 = reader.nextInt()//reading
    var lcm: Int //creating variable
    lcm = if (number1 > number2) number1 else number2 // base condition
    while (true) { //Infinite loop
        if (lcm % number1 == 0 && lcm % number2 == 0) { //If both are divisible
            println("The LCM of $number1 & $number2 is $lcm.") // printing
            break // breaking when condition was met
        }
        ++lcm //Incrementing LCM
    }
}