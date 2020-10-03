fun greeting23 ( vararg  x:String) {
    println("Hello World ")
    // x acts as an array
    x.forEach { i -> println("$i greeted") }
}

fun namedargs(abcd :String) {
    println("Hi $abcd")
}
fun namedargs2(abcd :String, xyz:String) {
    println("Hi $abcd and $xyz")
}

fun defparams(abcd:Int = 10){
    println(abcd)
}

fun main() {
    greeting23()
    greeting23("dibya")
    greeting23("dibya", "jyoti")
    var names = arrayOf("dibya", "jyoti", "123")
    greeting23(*names) // Spread of operator

    namedargs(abcd = "dibya")  // named parameter . It also allows us to mix up the order of args

    namedargs2("dibya", "jyoti")

    namedargs2(xyz = "jyoti", abcd = "dibya") // Note :- Although we are changing order here, we will get same output
    // as soon as we use named arguments for one argument, all the arguments followed will also have to be named


    //default parameters
    defparams(); // 10
    defparams(29) // 29
}