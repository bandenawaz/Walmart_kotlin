fun main(){

    var num: Int = 8
    //builtin function
    println("Square root of $num is: ${Math.sqrt(num.toDouble())}")
    greet()

    println("Sum : ${sum(19,20,30,40,50)}")
    defParams(100,200)

    val lmbdRes = {x: Int, y: Int, z: Int -> x + y + z}
    println(lmbdRes(30,40,50))

    displayName("Walmart",::demoName)
    val sm = sumFunc(20)
    println("Sum :${sm(20)}")
}

fun greet(){
    println("Hello!, Welcome to Walmart Training")
}

fun sum(vararg numbers: Int): Int{

    var sum: Int = 0
    numbers.forEach{num -> sum += num }
    return sum
}

fun defParams(a: Int ,b: Int  ){

    println("Sum : ${a + b}")
}

fun displayName(name: String, myFunction: (String) -> Unit) {

    println("This is demo for HigherOrder function")
    myFunction(name)
}

fun demoName(n: String){
    println(n)
}

fun sumFunc(num: Int): (Int) -> Int = {num1 -> num1 + num}

