// There is no static keyword in Kotlin

// static functionality in kotlin is achieved through companion objects

// [Important] ==> Companion objects also helps us achieve factory design pattern.


// This is called object declaration
object Hello {
    fun greet() {
        println("Hello Dibya")
    }
}

// Enums may contain properties and methods like other classes, separated from the list of instances by a semicolon.
enum class  Type {
    Easy, Medium, Hard;
    var xyz : Int = 10;
    fun hello() {
        println("hello from enum")
    }

}
class A {
    companion object abcd {
        fun create() : A {
            return A()
        }
        fun greet() {
            println("Hello from companion object ${Type.Easy}")
        }
        @JvmStatic
        fun greet2() {
            println("Hello2")
        }
    }
    fun hello() {
        println("Method of Class")
    }
    /**
     * Not allowed in the class scope. Only allowed inside companion objects scope
    @JvmStatic
    fun outsidetry() {
        println("try")
    }
    **/
}
fun main() {
    Hello.greet()
    // If we declare an object as companion object of a class, we can
    // call the methods inside that object directly through the class name
    // This emulates the behaviour of static methods of java
    // Its not exactly static method. It just emulates the behaviour
    // to make a method static, we need to use @JvmStatic Annotation
    A.greet()
    A.greet2()

    A.create().hello() // Method of class

    print(Type.Hard)
    var y = Type.Hard;
    print(y.xyz)
    print(y.hello())
}