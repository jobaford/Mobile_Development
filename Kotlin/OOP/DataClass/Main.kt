//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val name1 = "Alex"
    val name2 = "Alexandru"

    println(name1 == name2)
    println(name1 === name2) // referential equality operator check if in the same memory

    println("\n")

    val user1 = User("Alex", "Dobbin", 23)
    val user2 = User("Alex", "Dobbin", 23)

    println(user1.equals(user2))// user1 is the object calling user2 is the object passing in the values
    //println(user1 == user2) //the == operator is in the Any class
}

//class User(var firstName: String, var lastName: String, var age: Int){
//
//    override  fun equals(other: Any?): Boolean{ //Any? is all instance and including null
//        // (user1 === user2)
//        if (this === other){
//            return true
//        }
//
//        if (other is User){
//            return this.firstName == other.firstName
//                    && this.lastName == other.lastName
//                    && this.age == other.age
//
//        }
//
//        return false
//    }
//
//    override fun hashCode(): Int {
//        return 0
//    }
//
//    override fun toString(): String {
//        return "User(firstName='$firstName', lastName='$lastName', age='$age')"
//    }
//}

data class User(var firstName: String, var lastName: String){// the data keyword implements everything
    var age = 0 //this will exclude age from comparison
}