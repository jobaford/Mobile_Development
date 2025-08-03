//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val car1 = Car("Tesla", "S Plaid", "Red", 4)//Instantiation

    car1.name = "Tesla"
    car1.model = "S Plaid"
    car1.color = "Red"
    car1.doors = 4

    println("Name = ${car1.name}")
    println("Model = ${car1.model}")
    println("Color = ${car1.color}")
    println("Doors = ${car1.doors}")

    car1.move()
    car1.stop()

    val car2 = Car("Ford", "Mustang", "Blue", 2)

    println("\n")
    println("Name = ${car2.name}")
    println("Model = ${car2.model}")
    println("Color = ${car2.color}")
    println("Doors = ${car2.doors}")

    car2.move()
    car2.stop()
}

//Properties var name: String, var model: String, var color: String, var doors: Int
class Car(var name: String, var model: String, var color: String, var doors: Int){

    fun move(){
        println("The car $name is moving")
    }

    fun stop(){
        println("The car $name has stopped")
    }
}
