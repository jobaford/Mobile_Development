//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var x = 5
    val y = 3

    var result = x + y //x + y are Operands because of the operator +
    println("result = $result")

    println("x + y = ${x + y}") //this ${x + y} is an expression
    println("x - y = ${x - y}")
    println("x * y = ${x * y}")
    println("x / y = ${x / y}")
    println("x % y = ${x % y}")

    result += 2
    println("result = $result")

    result -= 2
    println("result = $result")

    result *= 2
    println("result = $result")

    result /= 2
    println("result = $result")

    result %= 2
    println("result = $result")

    x = 0

    println("x++ = ${x++}") //post-increment it prints first, then increments
    println("++x = ${++x}") //prefix-increment it increments first, then prints

    println("x-- = ${x--}") //post decrement
    println("--x = ${--x}") //prefix decrement
    
}