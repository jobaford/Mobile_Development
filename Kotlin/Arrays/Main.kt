//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //val names: Array<String> = arrayOf("John", "Stephan", "Megan")
    val names = arrayOf("John", "Stephan", "Megan")

    println("First element: ${names[0]}")

    names[0] = "Alex"
    println("First element: ${names[0]}")

    println("The size of the array is: ${names.size}")

    val mix = arrayOf(1,2,3,"John", "Stephan", 'J') //you can use any types
    for (values in mix){
        println(values)
    }

    for (values in mix){
        if (values is Int){
            println(values)
        }
    }
}