fun main() {

    // as in is a default keyword, if we want to use it as a variable
    // we use backtick as escape character
    var `in` = "hello"
    println(`in`)

// const vs val
    // const -> lets you define compile time constants
    // val -> lets you define run time constants

   var p = listOf(listOf(1,2,3), listOf(4,5,6))
    println(p.flatten()) // [1,2,3,4,5,6]
    println(p.flatten().size) //6
    // if you have a many-many function, and want a list instead of a list of list use flatmap
    // use map -> one->one
    //use flatMap -> one->many
    println(p.flatMap { listOf(it - 1, it + 1) })
    // Polymorphism is to OOP as Lazy eval is to FP


    /***
     *
     * Important -> Lazy eval
     */

    var p2 = listOf(1,2,3,4,5,6,7,8)
    println(p2.filter(::greater).map(::doubleIt).first()) // greater is called for all elements, non efficient

    println(p2.asSequence().filter(::greater).map(::doubleIt).first()) // only called for 1st 4// efficient
    // asSequence() is similar to stream() in java


    // Top level object in Kotlin -> Any


    /***
     *
     *  Safe operator
     */

    val str:String? = null;
    println(str?.length) // null

    
}

fun greater(n : Int) :  Boolean {
    println("greater is called $n")
    return n > 3
};
fun doubleIt(n : Int):Int
{
    return 2*n
}