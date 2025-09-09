//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val numbers = listOf("one","two","three","four")
    val longerThan3 = numbers.filter{ it.length > 3 }// the length of each string
    println(longerThan3)
    println("\n")

    val numbersMap = mapOf("key 1" to 1,"key 2" to 2,"key 3" to 3,"key 101" to 101)
    val filteredMap = numbersMap.filter{ it.key.endsWith("1") && it.value > 100 }
    println(filteredMap)
    println("\n")

    val filteredInx = numbers.filterIndexed { index,value -> (index != 0) && (value.length < 5)}
    val filteredNot = numbers.filterNot { it.length <= 3 }
    println(filteredInx)
    println(filteredNot)
    println("\n")

    val mixedList = listOf(1,2,3,'A','B','C',"Hello World","Alex",false)
    mixedList.filterIsInstance<Char>().forEach {// what ever i put in <> that is what will comeout
        println(it)
    }

    //Partition

    println("\n")
    val (match, rest) = numbers.partition { it.length > 3 }
    println(match)
    println(rest)
}

//output:
//[three, four]
//
//
//{key 101=101}
//
//
//[two, four]
//[three, four]
//
//
//A
//B
//C
//
//
//[three, four]
//[one, two]
//
//Process finished with exit code 0        