data class DataClass(val name:String, val age : Int) {

    // These properties are read only for data class

}
// Declaring a class a data class is when a class holds data
// When we declare a class as data class, kotlin provides certain methods for ease of use
fun main() {
    var p = DataClass("dibya", 23)
    var q = DataClass("jyoti", 24);
    println(p) //DataClass(name=dibya, age=23)
    println(p.equals(q)) //false
    println(p.equals(p.copy())); //true
    println(p.copy(name="dibya2")) //DataClass(name=dibya2, age=23)
    // we can call copy method provided by kotlin for data classes to copy the object
    // also while copying the object we can change certain parameter too
    println(p.component1()) // dibya
    // componentN gives the nth property of the data class



}