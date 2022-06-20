fun <T> shuffle(list: MutableList<T>) // Function for shuffling the List
{
    list.shuffle() //.shuffle() method for shuffling values
}
 
fun main() {
    val list: MutableList<Int?> = (1..16).toMutableList(); // List of numbers from 1-16
    shuffle(list) // shuffling the list
    for(i in 0..15) //Looping over and printing
    {
        if (i%4==0)
        {
            println() // Empty Line 
        }
        print(list[i])// Printing in matrix form
        print("  ")
    }
    
}