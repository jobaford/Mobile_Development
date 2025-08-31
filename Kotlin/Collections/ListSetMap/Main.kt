//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    //List:

    val names = listOf<String>("Name 1", "Name 2", "Name 3") //this is an immutable list

    val names2 = mutableListOf<String>("Name 1", "Name 2", "Name 3", "Name 1") //this is a mutable list

    names2.add("Name 4")
    names2.remove("Name 2") //you can also remove by index (0)

    names2.forEach { println(it) }
    println("\n")

    //Sets:

    //remove and add works with set
    val names3 = setOf<String>("Name 1", "Name 2", "Name 3", "Name 1") //this is an immutable set

    val names4 = mutableSetOf<String>("Name 1", "Name 2", "Name 3", "Name 1") //this is a mutable list

    names3.forEach { println(it) }
    println("\n")

    val user1 = User("Name 11")
    val user2 = User("Name 12")
    val user3 = User("Name 13")
    val user4 = User("Name 14")

    val names5 = mutableSetOf<User>(user1, user2, user3, user4)

    names5.forEach { println(it.name) }
    println("\n")

    //Maps:

    val users = mapOf<Int, String>(1 to "Maria", 2 to "Alex", 3 to "John") //mapOf<key, value>

    println(users[1])

    users.forEach { t, u -> println("$t and $u") }
    println("\n")

    val users2 = mutableMapOf<Int, String>(1 to "Maria", 2 to "Alex", 3 to "John")

    users2[4] = "Vlad"

    users2.remove(2)

    users2.forEach { t, u -> println("$t and $u") }
}

class User(val name: String)// this will show with duplicates

//data class User(val name: String) this will show without duplicates

//Output:

//Name 1
//Name 3
//Name 1
//Name 4
//
//
//Name 1
//Name 2
//Name 3
//
//
//Name 11
//Name 12
//Name 13
//Name 14
//
//
//Maria
//
//
//1 and Maria
//2 and John
//
//
//1 and Maria
//3 and John
//4 and Vlad
//Process finished with exit code 0
