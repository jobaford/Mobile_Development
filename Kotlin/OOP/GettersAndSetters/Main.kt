//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val user = User("Alex")
    val friend = User("John", "Smith")

    println("Name = ${user.firstName}")
    println("LastName = ${user.lastName}")
    println("Age = ${user.age}")

    user.firstName = "Jobally"

    println("\n")

    println("Name = ${friend.firstName}")
    println("LastName = ${friend.lastName}")
    println("Age = ${friend.age}")

}
//
class User(firstName: String, var lastName: String = "LastName", var age: Int = 0){
    var firstName = firstName
    get() {
        return "FirstName: $field"
    }
    set(value){
        println("$value was assigned to firstName")
        field = value
    }
}