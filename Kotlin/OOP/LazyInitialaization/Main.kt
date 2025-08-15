//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val user1 = User("Alex", "Dobbin", 23)
    val user2 by lazy { //you have to call it for it to initialize
        User("User1", "lastName", 0)
    }

    println(user2.firstName)
}

class User(var firstName: String, var lastName: String, var age: Int){
    init {
        println("User: $firstName was created")
    }
}