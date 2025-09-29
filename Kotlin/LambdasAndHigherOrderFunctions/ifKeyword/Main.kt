//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    upperCase("hello",{it.uppercase()})
}

fun upperCase(str: String, myFunction: (String) -> String) {
    val uppercsedWord = myFunction(str)

    println(uppercsedWord)
}

//output:
//HELLO
//
//Process finished with exit code 0