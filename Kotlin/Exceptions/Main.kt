import kotlin.div

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val a = 5
    val b = 0

    try {
        println(a / b)
        println("Divide by zero.")
    } catch (e: ArithmeticException) {
        println("You can't divide by zero: ${e.message}")
    } finally { // this will execute no matter what
        println("Divide by zero.")
    }

    println("\n")


// as an expression
    val result = try {
        println(a / b)
        a/b
        println("Divide by zero.")
    } catch (e: ArithmeticException) {
        println("You can't divide by zero: ${e.message}")
        0
    } finally { // this will execute no matter what
        println("Divide by zero.")
    }

    println(result)
}
//output:
//You can't divide by zero: / by zero
//Divide by zero.
//
//
//You can't divide by zero: / by zero
//Divide by zero.
//0
//
//Process finished with exit code 0
