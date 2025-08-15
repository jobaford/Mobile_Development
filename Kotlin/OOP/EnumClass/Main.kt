//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    for(direction in Direction.values()){
        println(direction)
    }

    println("\n")

    println(Direction.NORTH.direction)
    println(Direction.NORTH.distance)
    println(Direction.NORTH.name)

    println("\n")

    Direction.WEST.printData()

    val direction = Direction.EAST
    when(direction){
        Direction.EAST -> println("The direction is EAST")
        Direction.WEST -> println("The direction is WEST")
        Direction.NORTH -> println("The direction is NORTH")
        Direction.SOUTH -> println("The direction is SOUTH")
    }

    val direction2 = Direction.valueOf("east".uppercase()) //check if the value exist
}

enum class Direction(var direction: String, var distance: Int){
    NORTH("north", 10),
    SOUTH("south", 20),
    EAST("east", 15),
    WEST("west", 40);

    fun printData(){
        println("Direction = $direction and Distance = $distance")
    }
}

//output:

//NORTH
//SOUTH
//EAST
//WEST

//north
//10
//NORTH

//Direction = west and Distance = 40