// There are mainly 2 types of extensions
// extension functions and extension properties
// extension function means define the function/method of a class outside of the class

class Person2(val skills:String)
{
}
fun main() {
    var a = Person2("Java")
    var b = Person2("Kotlin")
    var c = a.plus(b)
    println(c.skills)
}
fun Person2.plus(second : Person2) : Person2 {
    return Person2(this.skills + second.skills)
}