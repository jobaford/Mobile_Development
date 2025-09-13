//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val numbers = listOf("one","two","three","four","five")
    println(numbers.groupBy { it.first().uppercase() })
    println(numbers.groupBy(keySelector = {it.first()}, valueTransform = {it.uppercase()}))
}

//output:
//{O=[one], T=[two, three], F=[four, five]}
//{o=[ONE], t=[TWO, THREE], f=[FOUR, FIVE]}
//
//Process finished with exit code 0