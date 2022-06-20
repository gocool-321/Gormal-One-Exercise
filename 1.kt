import java.util.Scanner // for Input
fun main() {
	val reader = Scanner(System.`in`) // Object for scanner
    val num = reader.nextInt() // reading
    if (num <0){ // Invalid Case
      println("No factorial")
    }
    else if(num == 0){ // 0! = 1
      println("Factorial of $num = 1")
    }
    else{ // Iteratively calculating the Factorial
      var factorial: Long = 1
      for (i in 1..num) { // Looping over and multiplying
          factorial *= i.toLong()
      }
      println("Factorial of $num = $factorial") //Printing factorial
    }
}