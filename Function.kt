fun greeting(): String {   // Note return type specified after name and colon unlike other pl
    return "Hello Kotlin"
}
//  Unit Return type == Void return type

fun greeting2() = "HELLO" // Single statement function definition.

fun greet(){ // This is same as declaring fun greet(): Unit {}
    println("void greeting")
}
fun greetOne( name: String)
{
    // Kotlin supports string templates

    println("Hello $name"); // Template printing instead of concatenation
}

fun greetOneSingleExpr(name:String) = println("Hello $name")
// All these above functions are defined outside of any class -> These are called top level functions


fun main(){
    println(greeting())
    greet();
    greetOne("dibya")
}