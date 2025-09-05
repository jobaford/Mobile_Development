//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val colors = listOf("red","brown","grey")
    val animals = listOf("fox","bear","wolf")

    //zipping
    println(colors.zip(animals))
    //println(colors zip animals) works the same
    println("\n")
    println(colors.zip(animals){ color, animal -> "The ${animal.replaceFirstChar { it.uppercase() }} is $color" })

    println("\n")
    //Unzipping
    val numberPairs = listOf("one" to 1,"two" to 2,"three" to 3,"four" to 4)
    println(numberPairs)
    println(numberPairs.unzip())

    println("\n")
    val number2 = listOf("one","two","three","four")
    println(number2.associateWith { it.length })
    println(number2.associateBy { it.first().uppercase() })
    println(number2.associateBy ( keySelector = {it.first().uppercase()}, valueTransform = {it.length}))
}

//output:
//
//[(red, fox), (brown, bear), (grey, wolf)]
//
//
//[The Fox is red, The Bear is brown, The Wolf is grey]
//
//
//[(one, 1), (two, 2), (three, 3), (four, 4)]
//([one, two, three, four], [1, 2, 3, 4])
//
//
//{one=3, two=3, three=5, four=4}
//{O=one, T=three, F=four}
//{O=3, T=5, F=4}
//
//Process finished with exit code 0