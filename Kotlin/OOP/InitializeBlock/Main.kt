//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val user = User("Alex", "Dobinca", 23)
    val friend = User("John", "Smith", 30)

    println("Name: ${friend.name}")
    println("Name: ${user.name}")
}

class User(name: String, var lastName: String, var age: Int){
    var name: String

    init { //you can add more than one initializer blocks
        if (name.lowercase().startsWith("a")){
            this.name = name
        }else{
            this.name = "User"
            println("The name doesn't start with the letter 'a' or 'A'")
        }
    }
}