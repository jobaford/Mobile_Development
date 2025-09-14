//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val numbers = listOf("one","two","three","four","five")
    println(numbers.elementAt(3))
    println(numbers.first())
    println(numbers.last())
    println("\n")

    println(numbers.first { it.length > 3 })
    println(numbers.last { it.startsWith("f") })
    println(numbers.random())
    println(numbers.isEmpty())
}

//output:
//four
//one
//five
//
//
//three
//five
//four
//false
//
//Process finished with exit code 0