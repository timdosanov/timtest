class Skin {

}

class PlayerDetails(
    val name: String,
    val skin: Skin,
    var isDead: Boolean
) {
}
enum class PlayerType {
    CREWMATE,
    IMPOSTER
}

class Player(
    playerDetails: PlayerDetails,
    type: PlayerType
) {
    lateinit var playerPositionOnMap: Coordinate

    fun move(): Coordinate {

        return Coordinate(1, 1, true)
    }
}

class Coordinate(
    val xPos: Long,
    val yPos: Long,
    val isPassable: Boolean
)


class GameMap() {
    var players: MutableList<PlayerDetails> = mutableListOf()
    val mapBoundaries: List<Coordinate> = mutableListOf()
    val gameObjects: List<GameObject> = mutableListOf()

    fun initialRun() {
        players = mutableListOf(
            PlayerDetails(
                name = "player",
                skin = Skin(),
                false
            )
        )
    }

    fun startRound() {

    }

    fun endRound() {

    }
}

fun main() {
    GameLogicManager().startGame()
}


