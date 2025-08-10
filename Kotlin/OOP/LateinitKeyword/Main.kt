//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val user = User("Alex", "Dobbin", 23)

    user.favoriteMovie = "Interstellar"

    println(user.favoriteMovie) //this will cause an error because it has not been initialized
}
//
class User(var firstName: String, var lastName: String, var age: Int){

    lateinit var favoriteMovie: String //for initializing a value later it is like a pass in python
}