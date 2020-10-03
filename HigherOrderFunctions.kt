import com.sun.jdi.BooleanValue

// Higher order function is a function that takes another function as parameter or returns another function
// In Kotlin, functions are first class, assigned to variables, passed to functions, return from functions
// Lambda functions -> nameless functions
// To pass a function in another func, we must get a reference to the function.

// forEach() is a higher order function, i.e it takes another function/lambda as parameter


fun printFilteredStrings(lst : List<String>, function : (String) -> Boolean) {
    lst.forEach {
        if(function(it))
            println(it)
    }
}


fun calc(x : Int, y : Int , op :(Int, Int) -> Int) : Int = op(x, y)

fun sum2(x : Int, y : Int ) : Int {
    return x+y
}



// Here (Int, Int) -> Int  refers to sum2's signature
fun returnfunc():  (Int, Int) -> Int {
    return ::sum2;
}


fun main() {
    var x = listOf(1,2,3,4,5,6)
    x.forEach { println(it) }
    x.forEach(::println) //lambda function, method reference

    val lambdaOne :  (Int) -> Boolean = {x -> x%2 == 0} // This is better in terms of readability

    val lambdaTwo = {x : Int -> x%2 == 0}
    println(lambdaOne(2)) //true
    println(lambdaOne(3)) //false
    println(lambdaTwo(2)) //true
    println(lambdaTwo(3)) //false

    var sum = {x: Int, y : Int -> x+y}
    print(sum(10, 166))

    println()


    println("higher order function test")
    val function : (String) -> Boolean = { it.startsWith("H")}
    val lst = listOf("Hello", "Hii", "Dibya", " Abcd", "HMX")
    printFilteredStrings(lst, function) // Here printFilteredStrings is a higher ordered function.

    /****
     * Important ------
     */
    // This only works if function is the last argument of higher order function
    printFilteredStrings(lst){
        it.startsWith("H")
    }
    println(calc(15, 20 , ::sum2)) // functional references

    println(calc(20,30, returnfunc()));

    val p : (Int) -> Int = { e -> e*2}
    println("----------------------------------")
    listOf(1,2,3,4,5,6)
            .filter{it % 2 == 0}
            .map(p)
            .forEach ( ::println )
}
/***
 *
 * pass through lambda can be replaced with function reference
 * for example -> println
 * if we are doing some other operation with the parameter, we can't use function reference.
 * as its not a pass through lambda
 */


