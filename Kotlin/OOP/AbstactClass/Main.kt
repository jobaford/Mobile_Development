import javax.script.ScriptEngine

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

}

abstract class Vehicle(){ //abstract classes can't crete instance it can only be inherited by other classes

    abstract fun move()

    abstract fun stop()
}

class Car(var name: String, var color: String, val engine: Int, val doors: Int): Vehicle(){
    override fun stop() {
        
    }

    override fun move() {

    }
}