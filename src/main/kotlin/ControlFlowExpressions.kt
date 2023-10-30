import java.util.Random
import java.util.Scanner

fun main(){
    //If expression
    println("Enter your age: ")
    /*val s_age: String? = readLine()

    if (s_age!!.isEmpty()) return

    val age: Int = s_age.toInt()

    if (age > 18){
        println("You can drive the car")
    }else{
        println("You need to grow up")
    }*/


    //if_expression
    val a = 34
    val b = 43

    val max = if (a > b) a else b

    println("max of $a and $b is $max")

    //when expression
    val r: Int = Random().nextInt(10) - 5
    println("The number is $r")
    //lets write when expression to handle positive and negative numbers
    when{
        r < 0 -> println("negative number")
        r == 0 -> println("its a zero")
        r > 0 -> println("positive number")
    }

    //Task: take the server codes from the user as inputs and check codes and display messages accordingly
    //Write code to greet people depending on the hour of the day
   /* val greet = Scanner(System.`in`)

    println("Enter the hour")
    //will use user input directly inside the when block
    when(greet.nextInt()){
        in 0..11 -> println("Good Morning")
        in 12..16 -> println("Good Afternoon")
        in 17..20 -> println("Good Evening")
        in 20..24 -> println("Good Night")
        else -> println("Not a valid hour to greet")
    }*/

    //While loop
    var i: Int = 0
    while (i < 10) {
        i++
        println("i is $i")
    }
    println(i)

    //do-while loop
    var num = 100
    do {
        println("The numbers are $num")
        num++
    }while (num<=100)

    //for loop
    val seasons = arrayOf("spring","Summer","Autumn","Winter")
    for(season in seasons){
        println(season)
    }
    //iterate over 1 to 15 numbers
    for  (i in 1..15){
        println(i)
    }
}

