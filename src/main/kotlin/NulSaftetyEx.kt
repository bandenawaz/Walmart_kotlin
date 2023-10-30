fun main(){

    //lets define a non-nullable string
    var fooString: String? = null
    //fooString = null

    var barString: String? = "bar"
    barString = null


    val length = fooString?.length ?: -1
    println(length)

    val barLength = barString?.length ?: -1
    println(barLength)

    //Not-null assertion operator !!
    val l = fooString!!.length
    println(l)

}