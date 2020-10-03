/***
 * Kotlin is a statically typed programming language
 * Developed by Jetbrains
 * Its the official language for Android Development
 * JVM based language. Also can compile down to Javascript
 */

// Run kotlin as a script -> kotlinc -script <filename>.kts


// Top level variables
var top : Int = 20;

fun main() {
    println("Hello World");
    var x : Int = 10;
    x = 20;
    println(x + top);
    val y : Int = 20;
    // y = 30 -> Error
    /***
     * Var is for variable, val is for constant.
     */

    /***
     * Types are not null by default. if we assign null value, we will get error
     */
   // x = null;----> Error

// the following is a nullable string.
    var nullable_string :String ? = "hello";
    nullable_string = null;

    println(nullable_string); // null

    //elvis operator
    var nameToPrint = nullable_string ?: "Not Set" // -> If nullable_string is null then nameToPrint is set to Not Set
    println(nameToPrint)  // Not set

    if(x == 5)
        println(" correct")
    else if(x == 20)
        println("ww")
    else
        println("wrong")

    // when statement is similar to switch statement in java

    when (x)
    {
        5 -> {
            println("x is 5");
        }
        20 ->  {
            println ("x is 20");
        }
        else ->
        {
            println("x is something else")
        }
    }

    var p = when(x){
        5  -> {
            20
        }
        6,7 -> {
            30
        }
        in 12..15 -> {
            45
        }
        else -> {
            30
        }
    }
    println(p)

// ranges

    for (i in 1..5)
        println(i)  // 1-5 inclusive
    for(i in 1 until 5) // 5 is exclusive
        println(i)
    for(i in 1..5 step 2)
        println(i)
    for(i in 10 downTo 1 )
        println(i)

    // No ternary operator in Kotlin

    /***
     * == used for structural comparison
     * === used for referential comparison
     * https://play.kotlinlang.org/byExample/02_control_flow/04_Equality%20Checks
     */

    var pt = """
        
        multiline string
        abcdddddd
    """.trimIndent()

    println(pt)
}