//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

        val footballPlayer = FootballPlayer("Football player 1")
        val footballPlayer2 = FootballPlayer("Football player 2")

        val baseballPlayer = BaseballPlayer("Baseball player 1")
        val baseballPlayer2 = BaseballPlayer("Baseball player 2")

        val footballTeam = Team("Football team", mutableListOf(footballPlayer))
        footballTeam.addPlayers(footballPlayer2)

        val baseballTeam = Team("Baseball team", mutableListOf(baseballPlayer))
        baseballTeam.addPlayers(baseballPlayer2)

        val gamesTeam = Team<GamesPlayer>("Game Team", mutableListOf())
    }

class Team<T: Player>(val name: String, val players: MutableList<T>){
        fun addPlayers(player: T){
            if (players.contains(player)){
                println("Player: ${(player as Player).name} is already in the team ${this.name}")
            }else{
                players.add(player)
                println("Player: ${(player as Player).name} was added in the team ${this.name}")
            }
        }
    }

//this is just for initializing
open class Player(val name: String)

class FootballPlayer(name: String): Player(name)
class BaseballPlayer(name: String): Player(name)
class GamesPlayer(name: String): Player(name)

//output:
//Player: Football player 2 was added in the team Football team
//Player: Baseball player 2 was added in the team Baseball team
//
//Process finished with exit code 0
//