//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Team<T>(val name: String, private val players: MutableList<in T>) where T: Player, T:Listener {
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

class FootballPlayer(name: String): Player(name), Listener{
    override fun listen() {

    }
}
class BaseballPlayer(name: String): Player(name)

open class GamesPlayer(name: String): Player(name)
class CounterStrikePlayer(name: String): GamesPlayer(name)

fun main(){

    val footballTeam = Team<Player>(
        "FootballTeam",
        mutableListOf<FootballPlayer>(FootballPlayer("Player 1"),FootballPlayer("Player 2"))
    )

    val gamesTeam = Team<CounterStrikePlayer>(
        "Games Player",
        mutableListOf(GamesPlayer("Player 1"),GamesPlayer("Player 2"))
    )

    addPlayer(FootballPlayer("Player 1"))
}

interface Listener {
    fun listen()
}

fun <T> addPlayer(player: T) where T: Player, T: Listener{

}
