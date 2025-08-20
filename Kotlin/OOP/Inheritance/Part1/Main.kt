//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val car = Car("BMW", "RED", 1, 4)
    val plain = Plane("Boeing", "WHITE and BLUE", 4, 4)

    car.move()
    car.stop()

    plain.move()
    plain.stop()
}

open class Vegicle(val name: String, val color: String){

    open fun move(){
        println("$name is moving")
    }

    fun stop(){
        println("$name has stopped")
    }
}

class Car(name: String, color: String, val engines: Int, val doors: Int): Vegicle(name, color) {

}

class Plane(name: String, color: String, val engines: Int, val doors: Int): Vegicle(name, color){
    override fun move() {
        flying()
        super.move() //super means call something from the base class
    }

    fun flying(){
        println("The plane is flying")
    }
}

//output:
// BMW is moving
// BMW has stopped
// The plane is flying
// Boeing is moving
// Boeing has stopped
