//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val numbersStrings = listOf("one","two","three","four")
    println(numbersStrings)
    println("\n")

    println(numbersStrings.joinToString())// will show without []
    println("\n")

    val listStrin = StringBuffer("The list of numbers:")
    println(numbersStrings.joinTo(listStrin))
    println("\n")

    println(numbersStrings.joinToString(separator = " | ", prefix = "start: ", postfix = ": end"))
    println("\n")

    val numbers = (1 .. 100).toList()
    println(numbers.joinToString(limit = 15, truncated = "<...>"))
    println("\n")

    println(numbersStrings.joinToString { "Element: ${it.uppercase()}" })
}

//output:
//[one, two, three, four]
//
//
//one, two, three, four
//
//
//The list of numbers:one, two, three, four
//
//
//start: one | two | three | four: end
//
//
//1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, <...>
//
//
//Element: ONE, Element: TWO, Element: THREE, Element: FOUR
//
//Process finished with exit code 0