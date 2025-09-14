//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val numbers = listOf(6,10,14,4,100)
    println("The sum is: ${numbers.sum()}")
    println("The count is: ${numbers.count()}")
    println("The average is: ${numbers.average()}")
    println("The max value is: ${numbers.maxOrNull()}")
    println("The min value is: ${numbers.minOrNull()}")
    println("The sum is: ${numbers.sumOf { it * 2 }}")
}

//output:
//The sum is: 134
//The count is: 5
//The average is: 26.8
//The max value is: 100
//The min value is: 4
//The sum is: 268
//
//Process finished with exit code 0