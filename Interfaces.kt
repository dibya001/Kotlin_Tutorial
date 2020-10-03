interface Interfaces {
    // We can also define properties in an interface
    // Although we can't initialize property here
    val property:String;
    fun greetMethod();
    // Interface can also have function defined, providing default implementation
    fun greet2() {
        println("greet2 method $property")
    }
}

interface I2 {
    fun greet2();
}
// implementing the interface
class Class1:Interfaces, I2 {

    //Overriding property
    override val property: String
        get() = "Class1"
    // Override keyword must be added to the overridden function
    // in java we had @override annotation

     override fun greetMethod() {
         super.greet2()
        println("Welcome Dibya")
    }

    override fun greet2() {
        println("greeting 2")
    }

}

// For abstract class, we don't have to explicitly declare them as open
// Its open by default

abstract class Class2 : Interfaces {

}

open class BaseClass {
    // methods are closed by default.
    // In order to override that in a subclass, we need to declare the method with open keyword

    // declare protected to avoid access outside class
    protected open var name:String = "Base Name"
    open fun method() {
        println("base class method")
    }
    // If we are not overridding a method, we don't need to declare a method open
    // Declaring a method as open also dont enforces us to override it
     fun method2() {
        println("base class method2")
    }
}

/***
 * In Kotlin, classes are closed/final by default.
 * So they can't be inherited or extended.
 * In order to extend the class we need to add the open keyword before the base class.
 *
 */
class ChildClass : BaseClass() {
     override var name = "Child String"
    override fun method() {
        println("$name child class method is called")
    }
}


fun main() {
    var p = Class1()
    p.greetMethod() // Welcome Dibya
    p.greet2()
    println(p is Class1) //true
    println(p !is Interfaces)  //false
    // var p2 = Class2(); -> Can't create instance of abstract class


    //---------------------------------------
    var c = ChildClass();
    c.method() // Childclass method is called
    c.method2() // base class method2

    (c as BaseClass).method() // Child class method is called
}