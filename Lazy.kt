fun greet4() : Int{
    println("Hello World")
    return 12;
}
fun main() {
    val x = 10;
    val ab : Int = greet4()
    if(x > 5 || ab == 5)
    {
        println("Hii")
    }
    /***
     * Output
     * Hello World
     * Hii
     */

    // Lazy work

    val ab2 by lazy { greet4() }
    if(x > 5 || ab2 == 5)
        println("Hii")
    /***
     * Output
     * Hii
     */
}