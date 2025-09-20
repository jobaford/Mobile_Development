//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val footballPlayer = FootballPlayer("Football player 1")
    val footballPlayer2 = FootballPlayer("Football player 2")

    val baseballPlayer = BaseballPlayer("Football player 1")
    val baseballPlayer2 = BaseballPlayer("Football player 2")

    val footballTeam = Team<FootballPlayer>("Football team", mutableListOf(footballPlayer))
    footballTeam.addPlayers(footballPlayer2)
}

class Team<T>(val name: String, val players: MutableList<T>){
    fun addPlayers(player: T){
        if (players.contains(player)){
            println("Player: ${(player as Player).name} is already in the team ${this.name}")
        }else{
            players.add(player)
            println("Player: ${(player as Player).name} was added in the team ${this.name}")
        }
    }
}

open class Player(val name: String)

class FootballPlayer(name: String): Player(name)
class BaseballPlayer(name: String): Player(name)

//output:

//Player: Football player 2 was added in the team Football team
