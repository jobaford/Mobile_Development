//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val user = User("Alex")
    val friend = User("John", "Smith")

    println("Name = ${user.firstName}")
    println("LastName = ${user.lastName}")
    println("Age = ${user.age}")

    println("\n")

    println("Name = ${friend.firstName}")
    println("LastName = ${friend.lastName}")
    println("Age = ${friend.age}")

}
//Default constructors can only be use with the primary constructor
class User(var firstName: String, var lastName: String = "LastName", var age: Int = 0){

}