//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val user = User("Alex")
    val friend = User("John", "Smith", 30)


}

class User(var name: String, var lastName: String, var age: Int){
    //constructor() is the secondary constructor
    constructor(name: String): this(name, "LastName", 0) //this() calling the primary constructor

}