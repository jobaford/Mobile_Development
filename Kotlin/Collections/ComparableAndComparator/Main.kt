//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val numbers = mutableListOf(2,4,1,40,20,100,60)
    numbers.sorted().forEach { println(it) }
    println("\n")

    val laptops = mutableListOf(
        Laptop("Dell", 2021, 4, 600 ),
        Laptop("Acer", 2020, 8, 800 ),
        Laptop("Apple", 2022, 16, 1000 )
    )

    laptops.sortedBy { it.price }.forEach { println(it) }
    println("\n")

    laptops.sortedBy { it.ram }.forEach { println(it) }
    println("\n")

    laptops.sortedWith(compareBy<Laptop> { it.year }.thenBy { it.price }).forEach { println(it) }
}

data class Laptop(val brand: String, val year: Int, val ram: Int, val price: Int)