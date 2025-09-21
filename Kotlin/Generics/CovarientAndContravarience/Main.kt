class Team<T: Player>(val name: String, private val players: MutableList<in T>){// covarient <out T> | contravarience <in T>
    fun addPlayers(player: T){
        if (players.contains(player)){
            println("Player: ${player.name} is already in the team.")
        }else{
            players.add(player)
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
    //covarient
    val footballTeam = Team<Player>(
        "Football Team",
        mutableListOf<FootballPlayer>(FootballPlayer("Player 1"), FootballPlayer("Player 2"))
    )

    //contravarience
    val gamesTeam = Team<CounterStrikePlayer>(
        "Games Team",
        mutableListOf<GamesPlayer>(GamesPlayer("Player 1"), GamesPlayer("Player 2"))
    )
}