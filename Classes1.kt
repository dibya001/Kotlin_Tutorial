class Person(name:String) {
    //  Can be immediate assignment too
   var name2 = name;
    var name3:String;
    var nickname:String? = null
    set(value) {
        field = value;
        println("nickname is set to $value")
    }
    get() {
        // this function is called when the nickname property is accessed
        println("the returned value is $field")
        return field;
    }
    // Property can also be initialized in an init block too
    // multiple init blocks are also allowed


    // Secondary constructor -> provide alternative way to instantiate an object
    constructor():this("default name"){
        println("secondary constructor called")
    }
    init {
        name3 = name;
        println("init block") // called first
    }
    fun getName() :String{
        return this.name3;
    }
}


// Private Constructor
class Abcd private constructor(val name:String) {
    val name2 = name;
    init {
        println("init block is called")
    }
}

fun main() {
    var p: Person = Person("dibya"); // No new keyword --> this is calling primary constructor
    println(p.getName())
    println(p.name2) //Property access syntax
    var p2 : Person = Person() // Here secondary constructor is called
    println(p2.name2) //Property access syntax
    // Init block is called ahead of secondary constructor

    // All properties have getters and setters generated by the compiler by default
    // We can also override the getters and setters to provide our implementation.
    println(p.nickname)
    p.nickname = "Guddu" // nickname is set to Guddu -> This calls the set method
    println(p.nickname)
    p.name2 = "dibya"

    // Classes. methods. properties is public by default
    // Other visibility
    // Internal -> Class is public only in the module
    //Private -> Class is accessible only in the file

    //Properties/Methods
    //Internal -> Property is accessible in module
    //Protected -> Can be accessible only within the class and subclass
    //Private -> is only accessible in the class


     // var abcd = Abcd() -> This class has private constructor. Hence can't be instantiated


}