import kotlin.math.max

fun main() {
    var lst = listOf(1,2,3,4,5,2,3,1,1,1,4,5,5)
    println(lst.groupBy {
        it
    }.map {
        Pair(it, it.value.count())
    })

    var nums = 1..100
    var (xyz, abcd) =  nums.filter {
        it % 3 == 0
    }.partition { it % 6  == 0 }

    println(xyz)

/***
 *  Super Important
 *  lambdas are not exactly same as anonymous functions in kotline
 * */

    println("---------------------")
    function() // HelloHelloHelloHello

    function2() // many number of hellos

}
fun function() {
    val x = 1..100;
    x.forEach {
        if(it % 5 == 0)
            return; // -> This returns from the function() not for each
        print("Hello")
    }
}


fun function2() {
    val x = 1..100;
    x.forEach {
        if(it % 5 == 0)
            return@forEach;
        print("Hello")
    }
}