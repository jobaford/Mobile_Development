//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    sayHello()
    sayHello2("Jobally")
    sayHello3("Jobally", 25)
    sayHello4("Jobally", 25)

    val hasInternetConnection = true
    if (hasInternetConnection){
        getData("Some data")
    }else{
        showMessage()
    }

    val max = getMax(4, 8)
    println("$max")

    println(getMax2(4, 8))

    println(getMax3(4, 8))

    println(getMax4(4, 8, 50))

    sendMessage()

    sum(5,6,7,10)
    sum2(5,6,7,10)
}

fun sayHello(){
    println("Hello")
}

fun sayHello2(name: String){ //variables in parameters cannot be changed because they are declared as val
    println("$name")
}

fun sayHello3(name: String, age: Int){
    println("Hello, $name! Your age is $age")
}

fun sayHello4(name: String, age: Int){
    var number = age //the only way to change the value
    number = 30
    println("$name! Your age is $age")
}

fun getData(data: String){
    println("Your data is: $data")
}

fun showMessage(){
    println("There's no internet connection")
}

//return
fun getMax(a: Int, b: Int): Int {
    val max = if (a > b) a else b
    return max
}

fun getMax2(a: Int, b: Int): Int {
    return if (a > b) a else b
}

//expression
//here you can remove :Int
fun getMax3(a: Int, b: Int) = if (a > b) a else b

//function overloading
fun getMax4(a: Int, b: Int) = if (a > b) a else b
fun getMax4(a: Double, b: Double) = if (a > b) a else b
fun getMax4(a: Int, b: Int, c: Int): Int {
    if (a >= b && a >= c) {
        return a
    }else if (b >= a && b >= c) {
        return b
    }else{
        return c
    }

}
//Default functions
fun sendMessage(name: String = "User", message: String = ""){
    println("Name = $name and message = $message")
}

fun sum(vararg numbers: Int): Int {
    var result = 0
    for (number in numbers){
        result += number
    }

    return result
}

fun sum2(vararg numbers: Int) {
    numbers.forEach { println(it) }
}