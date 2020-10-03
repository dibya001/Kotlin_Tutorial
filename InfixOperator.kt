

fun String.isSame(n : String) = this == n

infix fun String.isSame2(n : String) = this == n
fun main() {
    println("Me".isSame("Me")) // true
     // "Me" isSame "Me" --> Error
    "Me" isSame2  "Me" // Infix notation
}