//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
//for loops
    for (i in 1..10){
        if (i in 3..8){
            break
        }
        println(i)
    }

    for (i in 1..10){
        println(i)
    }

    //same as previous but will exclude the last digit
    for (i in 1 until 10){ //can only count from lowest to highest
        println(i)
    }

    for (i in 10 downTo 1){
        println(i)
    }

    for (i in 1 until 10 step 2){
        println(i)
    }

//while loop
    var number = 0
    while (number < 10){
        println(number)
        number++
    }

    while (number < 10) println(number++)

    while (number < 10) {
        if (number == 7) {
            continue //this will go right back to the while loop meaning the print line will not get executed
        }
        println(number)
        number++
    }

    while (number < 10) {
        number++

        if (number < 2 && number < 8) {
            continue
        }
        println(number)
    }

    //same as previous code
    while (number < 10) {
        number++

        if (number in 3..7) {
            continue
        }
        println(number)
    }

    while (number < 10) {
        number++

        if (number < 10) {
            break
        }
        println(number)
    }

    outer@ while (number < 10) {
        number++

        if (number < 10) {
            break
        }

        var i = 0

        while (i < 5) {
            if (i == 0) break@outer
            i++
            println("****$i")
        }
    }

//do while
    do {
        println(number)
    } while (number <10)
}
