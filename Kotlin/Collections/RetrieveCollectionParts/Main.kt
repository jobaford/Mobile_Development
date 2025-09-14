//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val numbersStrings = listOf("one","two","three","four","five","six")
    println(numbersStrings.slice(1..3))
    println(numbersStrings.slice(0..4 step 2))
    println(numbersStrings.slice(setOf(3,5,0)))
    println("\n")

    println(numbersStrings.take(3))
    println(numbersStrings.takeLast(3))
    println(numbersStrings.drop(1))
    println(numbersStrings.dropLast(5))
    println("\n")

    println(numbersStrings.takeWhile { !it.startsWith("f") })// takes elements from the start of the list until the condition is false.
    println(numbersStrings.takeLastWhile { it != "three" })// works from the end of the list until the condition is false.
    println(numbersStrings.dropWhile { it.length == 3 })// drops elements from the start while the condition is true.
    println(numbersStrings.dropLastWhile { it.contains("i") })// drops elements from the end while the condition is true.
    println("\n")

    val numbers = (0..13).toList()
    println(numbers.chunked(3))
    println(numbers.chunked(3){it.sum()})
    println("\n")

    val numbersStrings2 = numbersStrings
    println(numbersStrings2.windowed(3))

}