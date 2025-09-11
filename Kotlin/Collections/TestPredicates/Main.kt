//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val numbers = listOf("one","two","three","four")
    val longerThan3 = numbers.filter{ it.length > 3 }// the length of each string
    println(longerThan3)
    println("\n")

    println("\n")
    val (match, rest) = numbers.partition { it.length > 3 }
    println(match)
    println(rest)
    println(numbers.any{ it.endsWith("e") })
    println(numbers.none{ it.endsWith("w") })
    println(numbers.all{ it.length > 1 })
}