fun main(){

    val str: String = "Walmart Kotlin Training"
    val longString = """ Welcome to Walmart 
        |Kotlin Training Program"""
    println(longString)

    //get the length of the string`
    println("String length is ${str.length}")


    //Lets Compare two strings
    var str1: String = "Walmart"
    var str2: String = "walmart"

    //lets compare two strings
    println(str1.equals(str2))

    //compare two strings
    println(str2.compareTo(str1))

    //Lets access a character in a string at a specific index
    println(str1.get(2))

}