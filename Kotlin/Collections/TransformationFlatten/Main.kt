//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val numbersSet = listOf(setOf(1,2,3),setOf(4,5,6),setOf(7,8,9))

    for (numbers in numbersSet){// this takes the rows
        for (number in numbers){// this takes the individual numbers in the rows
            println(number)
        }
        println("\n")
    }

    val numbersFlatten = numbersSet.flatten()
    println(numbersFlatten[8])
    println("\n")

    for (number in numbersFlatten){
        println(number)
    }

}

//output:
//1
//2
//3
//
//
//4
//5
//6
//
//
//7
//8
//9
//
//
//9
//
//
//1
//2
//3
//4
//5
//6
//7
//8
//9
//
//Process finished with exit code 0
