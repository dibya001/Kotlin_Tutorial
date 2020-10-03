open class Base {
    open fun method1() {
        println("Base class method1")
    }
}
// Object expression allows us to create anonymous inner class
// So we dont have to create a new named class

fun main() {
    // Object Expression allows us to create Single instance
    // Its called lazy instantiation. Similar to singleton class

    var c =  object : Base() {
        override fun method1() {
            println("child class method1")
        }
    }
    c.method1() // child class method1

}