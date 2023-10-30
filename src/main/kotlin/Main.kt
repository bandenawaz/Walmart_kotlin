fun main(args: Array<String>) {
   // println("Hello World!")

    //Immuatable Variables
    val name = "Walmart Training"
    println(name)

    //lets try to reassign new name
    //name = "Kotlin Training"
    val newName: String = "Kotlin Training"
    val nmbr: Int = 25

    val age: Int
    age = 30


    //Muable Variables
    var myName = "Nawaz"
    var myAge: Int  //Type inference
    myAge = 35
    print("My Details are: "+myName+ " "+myAge)
    println(name)
    print(nmbr)

}