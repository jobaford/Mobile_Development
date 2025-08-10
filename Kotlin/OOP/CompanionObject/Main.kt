//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println(Calculator.sum(3,5))
    println(Calculator.max)
}

class Calculator {

    companion object {
        var max = 100
        fun sum(a: Int, b: Int): Int {
            return a + b
        }
    }
}