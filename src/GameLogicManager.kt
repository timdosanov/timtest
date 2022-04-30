class GameLogicManager(

) {
    fun startGame() {
        createMap()
    }

    fun createMap(): GameMap {

        return GameMap()
    }
}

class GameObserver(

) {

    fun isGameEnded(playersType: List<PlayerType>): Boolean {

    }
}