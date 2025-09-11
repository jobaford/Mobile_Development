//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val numbers = mutableListOf("one","two","three","four")
    val plusList = numbers + "five"
    val minusList = numbers - mutableListOf("three","four")

    println(plusList)
    println(minusList)
}

//output:
//[one, two, three, four, five]
//[one, two]
//
//Process finished with exit code 0