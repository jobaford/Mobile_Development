//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val isActive = true
    val score = 80
    val num1 = 5
    val num2 = 4

    if(!isActive){
        println("is true")
    }else{
        println("is false")
    }

    if (isActive && score == 100){
        println("You are at the next level.")
    }else{
        println("You are at the same level.")
    }

    if (num1 > 0 || num2 > 0){
        println("The condition is true")
    }else{
        println("The condition is false")
    }

    // if expressin
    val text = if (num1 > -5 || num2 > -4){
        println("The condition is true")
        "This is text 1"
    }else{
        println("The condition is false")
        "This is text 2"
    }
    println("$text")

    val text2 = if (num1 < 0 || num2 < 0) "This is text 1" else 5
    println("$text2")
}