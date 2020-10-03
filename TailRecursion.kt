import java.math.BigInteger

fun fact(x:BigInteger) : BigInteger {
    if(x == (BigInteger.ONE))
        return BigInteger.ONE;
    return x * fact(x.minus(BigInteger.ONE))
}

// We can make a recursion as tail recursion,
// We have to make sure, we dont keep any statements in pending in stack
// We need to declare the function as tailrec
tailrec  fun tailfact(x:BigInteger, result:BigInteger) : BigInteger {
    if(x == (BigInteger.ONE))
        return result;
    return tailfact(x.minus(BigInteger.ONE), result * x)
}

fun main() {

    var b: BigInteger = BigInteger.valueOf(70);
    println(fact(b))
    //Stack Overflow Error
    // b =    BigInteger.valueOf(70000)
    // println(fact(b))
    // To solve this we will use tail recursion
    b =    BigInteger.valueOf(7000)
    var ans = BigInteger.ONE
    println(tailfact(b, ans))
}