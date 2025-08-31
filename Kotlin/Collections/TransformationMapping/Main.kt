//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val numbers = setOf(1,2,3,4,5)

    println(numbers.map { it * 10 })// do whatever in the {} and apply it to the elements

    println(numbers.map { if (it == 3) it * 100 else it * 10 })

    println(numbers.mapIndexedNotNull { index, value -> if (index == 0) null else index * value})

    val numbersMap = mapOf("key 1" to 1, "key 2" to 2, "key 3" to 3, "key 4" to 4)

    println(numbersMap.mapKeys { it.key.uppercase() })

    println(numbersMap.mapValues { it.value + it.key.length })

}

//output:
//[10, 20, 30, 40, 50]
//[10, 20, 300, 40, 50]
//[2, 6, 12, 20]
//{KEY 1=1, KEY 2=2, KEY 3=3, KEY 4=4}
//{key 1=6, key 2=7, key 3=8, key 4=9}
//
//Process finished with exit code 0
        