fun main(args: Array<String>) {
    println("Hello, World!")
    copyAddress(Address)
}

var numbers = listOf("one", "two", "three", "four")



val newnums = listOf(1,2,3,4,5)

// multiple function sytax
fun sum(a: Int, b: Int) = a + b

fun altsum(a: Int, b :Int): Int {
  return a + b
}

// if return type has no meaningful value can use unit(not required)
fun demo(a: Int, b:Int): Unit {
  println("sum of $a and $b is ${a + b}")
}

// VARIABLES
// cannot be reassigned like SYMBOL javascript()
val exists: Int = 1
val alsoexists = 1
val additionallyexists: Int
additionallyexists = 1
// can be reassigned like javascript variables
var doesnotexist: Int = 0

class Address {
    var name: String = "Holmes, Sherlock"
    var street: String = "Baker"
    var city: String = "London"
    var state: String? = null
    var zip: String = "123456"
}

fun copyAddress(address: Address): Address {
    val result = Address() // there's no 'new' keyword in Kotlin
    result.name = address.name // accessors are called
    result.street = address.street
    // ...
    return result
}
