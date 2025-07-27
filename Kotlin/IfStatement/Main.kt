//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val isActive = true

    if (isActive == true){
        println("The condition is true.")
    } else{
        println("The condition is false.")
    }

    val myNumber = 5

    if (myNumber > 5){
        println("The condition is true.")
    } else{
        println("The condition is false.")
    }

    if (myNumber > 5){ //will print the first true
        println("The condition is true.")
    } else if(myNumber > 4){
        println("The condition is less than 4.")
    } else {
        println("The condition is false.")
    }

    if (myNumber == 5) //this works without {}
        println("The condition is true and without {}.")
}