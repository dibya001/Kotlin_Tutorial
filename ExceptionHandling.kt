
fun main() {
    var str = "4a"

    try {
        println(str.toInt())
    }catch (e:Exception){
        println(e.toString()) // number format exception
    }
    finally {
        println("finally block is called")
    }

    // Below is a feature of Kotlin. Called try expression
    var num = try {
        str.toInt()
    }
    catch (e:java.lang.Exception)
    {
        -1
    }
    println(num)
    var a = "Hello"
    var b = "Hello"
    println(a.equals(b)) //true
    println(a===b) // true
}