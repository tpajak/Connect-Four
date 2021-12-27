// You can experiment here, it won’t be checked

fun main(args: Array<String>) {
    // put your code here

    initialiseEmptyBoardList(3, 5)
}

fun initialiseEmptyBoard(rows: Int, columns: Int): Array<Array<String>> {
    val rows = rows
    val cols = columns

    val gameBoard = Array(rows) { Array(cols) {"_"} }
    gameBoard[2][2] = "o"
    for (row in gameBoard) {
        println(row.contentToString())
    }
    return gameBoard
}


fun initialiseEmptyBoardArray(rows: Int, columns: Int): MutableList<MutableList<String>> {
//    val gam = emptyList<MutableList<String>>().toMutableList()
    var gameBoard: MutableList<MutableList<String>> = mutableListOf(
        mutableListOf(),
        mutableListOf()
    )

    for (i in 0..1) {
        for (j in 0..1) {
            if (j % 2 == 1) {
                gameBoard[i].add(gameBoard[j].add("║").toString())
                println("odd " + gameBoard[i][j])
            } else {
//                gameBoard[i].add(" ")
                gameBoard[i].add(gameBoard[j].add(" ").toString())
                println("even " + gameBoard[i][j])
            }
        }
        println("initialiseEmptyBoard: STOP")

        gameBoard.forEach {
            it.forEach { it -> print("$it, ") }
            println()
        }
    }


    return gameBoard
}
