import java.util.*
 
fun main() {
  // intializing variables for usage
    var counter = 0; // setting counter variable
    var value = 7 // as per Question setting value as 7
    while(counter<=4){ //printing 4 values 
        if((value%2==1) && (value%3==1) && (value%4==1) && (value%5==1) && (value%6==1)) //Checking the condition for remainders of 2,3,4,5,6
        {,
            
            counter = counter+1 // Incrementing counter
            if(counter==3){ // at 3rd iteration skipping
                continue
            }
            println(value) //Printing value
            value+=7 //Incrementing value by 7
        }
    }
},