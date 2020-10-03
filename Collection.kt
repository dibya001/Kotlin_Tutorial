

fun main(){
    var arr = arrayOf(1,3,5);
    println(arr) // object
    println(arr.size) //3
    println(arr[2]) // 5
   // println(arr[5]) ---> Array Index out of bound exception
    println(arr.get(0))
    arr.forEach { x -> println(x+1) } // 2,4,6
    for ( x in arr)
        println(x*2)


    /****
    // Another way to create array
    // can't change size
    ***/
    var arr5 = IntArray(3)
    arr5.set(0, 1);
    arr5[1] = 15;
    arr5.set(2, 20)


    arr.forEachIndexed { index, i -> println("$index $i") }   // This is lambda syntax in Kotlin


    // map an filter
    val positives = arr.filter { x -> x > 0 }
    positives.forEach{ x -> println(x)}

    var arr3 = arr.map { x -> x*2 }
    for(p in arr3)
        print (p)

    /*** all , any none
     * first, last, firstof, lastof
     * count :- https://play.kotlinlang.org/byExample/05_Collections/08_count
     * min(), max()
     * sorted(), sortedBy() -> https://play.kotlinlang.org/byExample/05_Collections/14_sorted
     * zip() -> https://play.kotlinlang.org/byExample/05_Collections/16_zip
     * take(n) -> take n members of collection
     * takeLast(n)
     * filterNotNull()
     * associate()
     */
    //create map
    val list = listOf(null, "Java", "Kotlin", "cpp")
    list.filterNotNull().associateWith { it.length }.forEach{  println(it)}

    println("Max value is ${list.filterNotNull().maxBy { it.length }}") // Kotlin
    println(list.filterNotNull().findLast { it.startsWith("Kkk") }) //null

    println("first elem is ${arr3.first()}")


    println(arr3.any{it > 2})
    println(arr3.any{ it % 2 == 0})

    // List
    var arr2 = listOf("hello", "world", "dibya")
    println(arr2[1])
    println(arr2.size)
    arr2.forEach{x -> println(x)}

    /*** Difference between Array and List
     * 1 - Array is of fixed size; list/mutable_list size changes
     * 2 - Array is optimized for primitive types.
     *
     */


    // Map

    var mp = mapOf<Int, String>(1 to "one",
    2 to "two",
    3 to "three")
    mp.forEach{ (i, s) ->
        println("key is $i val is $s")
    }
    // mp[3] = "world"; -> By default collection type is immutable.

    var mp2 = mutableMapOf(1 to "one",
            2 to "two",
            3 to "three")
    mp2[3] = "world"
    mp2.forEach{ (i, s) ->
        println("key is $i val is $s")
    }
    println("----------------")
    mp2.put(4, "four")
    mp2.forEach{ (i, s) ->
        println("key is $i val is $s")
    }
    println("----------------")
    mp2.remove(3)
    mp2.forEach{ (i, s) ->
        println("key is $i val is $s")
    }
    println("----------------")
    // No error on deleting on not present key
    mp2.remove(3)
    mp2.forEach{ (i, s) ->
        println("key is $i val is $s")
    }
    println("----------------")

    mp2.put(4, "changed") // Overwritten
    mp2.forEach{ (i, s) ->
        println("key is $i val is $s")
    }

    // Important function ->
    // getOrElse()
   // println(arr[10]) -> Index out of bounds exception

    println(arr.getOrElse(10) {-1}) // here -1 is the default value
    // getOrElse can also be applied with map for non existent key



    // flatmap
    // flatMap transforms each element of a collection into an iterable object and builds a single list of the transformation results. The transformation is user-defined.
    var arr4 = arr2.flatMap { x -> listOf(x, x) } // every element of arr2 is repeated twice. flattened array is created which is arr4
    arr4.forEach{x -> println("val is $x")}

    // partition

    var x = listOf(1,2,3,4,5,6,7,8)
    var (odd, even) = x.partition { it -> it%2  == 0 }
    println("odd numbers are")
    odd.forEach{ println(it)}
    println("even numbers are")
    even.forEach{println(it)}
}