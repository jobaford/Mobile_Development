//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Team<T: Player>(val name: String, private val players: MutableList<in T>){// covarient <out T> | contravarience <in T>
fun addPlayers(player: T){
    if (players.contains(player)){
        println("Player: ${player.name} is already in the team.")
    }else{
        //players.add(player)
        println("Player: ${player.name} was added in the team.")
    }
  }
}

//this is just for initializing
open class Player(val name: String)

class FootballPlayer(name: String): Player(name)
class BaseballPlayer(name: String): Player(name)

open class GamesPlayer(name: String): Player(name)
class CounterStrikePlayer(name: String): GamesPlayer(name)

fun main(){

    val mixedList = mutableListOf(1,2,360,'a','b','c',"hello","world")

    val specificList = getSpecificType<Int>(mixedList)

    for (element in specificList) {
        println(element)
    }
}

inline fun <reified T> getSpecificType(list: List<Any>): List<T>{
    val specificList = mutableListOf<T>()

    for (element in list){
        if (element is T){
            specificList.add(element)
        }
    }
    return specificList
}