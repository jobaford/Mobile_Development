//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

}

interface Engine{//interface can't have constructors
fun startEngine()
}

class Car(val name: String, val color: String): Engine{
    override fun startEngine() {
        println("The car is starting the engine.")
    }

}

class Truck(val name: String, val color: String): Engine {
    override fun startEngine() {
        println("The truck is starting the engine.")
    }

}

class Plane(val name: String, val color: String): Engine{
    override fun startEngine() {
        println("The plane is starting the engine.")
    }

}