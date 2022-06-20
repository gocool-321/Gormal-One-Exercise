import java.util.Scanner; //For Input
fun isPalindromeFunction(s:String):Boolean{ // Checks for Palindrome
    var s1 = s.reversed() //Reversed of String
    if(s == s1){ // Reversed ==  Current String -> Palindrome
        return true
    }
    return false // Not Palindrome
}

fun main(){
    var s = readLine()!!.toString() //reading Input
    var special = " ~`!@#$%^&*()_-+={}|[]\\:\";'<>?,./\"" // Special Characters for removal
    for (i in s){ // Looping over and removing special chars
        if (i in special){
            s=s.replace(i.toString(), "")
    }
} //Printing for Palindrome
    if (isPalindromeFunction(s)){
        println("Yes - Palindrome")
    }
    else{
        println("No - Not a Palidrome")
    }
}
