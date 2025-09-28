//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    add(2,4)

    val myLambda = {a: Int, b: Int -> println("$a + $b = ${a+b}")}

    myLambda(8,9)

    //val myLambda2 = {a: Int -> println(a)}

    //add2(6,4, {a: Int -> println(a)})

    add2(6,4) {a: Int -> println(a)}

    val loginButton = Button("Login", 34345, {
        //login
    })

    val singUpButton = Button("Login", 2345,{
        //sing up
    })
}

fun add(a: Int, b: Int){
    println("$a + $b = ${a+b}" )
}

fun add2(a: Int, b: Int, lambda: (Int) -> Unit){
    lambda(a+b)
}

class Button(val text: String, val id: Int, val onClickListener: () -> Unit)