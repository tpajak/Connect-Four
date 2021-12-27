package connectfour
/*
TODO LIST
*/

const val POINT_FOR_WIN = 2
const val POINT_FOR_DRAW = 1

fun main() {
    var rows: Int = 0
    var columns: Int = 0
    var userBoardSize: String
    val properBoardSize = Regex("^\$|^\\d+(\\s+)?[xX](\\s+)?\\d+\$")
    val pawnPlayerOne: String = "o"
    val pawnPlayerTwo: String = "*"
    var isGameOver: Boolean = false
    var isMultiRoundGame: Boolean = false
    var playerOneScore: Int = 0
    var playerTwoScore: Int = 0
    var numberOfGamesToPlay = 0
    var currentGameCounter = 0
    lateinit var gameBoard: Array<Array<String>>

    fun setCurrentGameCounter(roundsToPlay: Int) {
        currentGameCounter = roundsToPlay
    }

    fun updateCurrentGameCounter() {
        currentGameCounter++
    }


    println("Connect Four")
    println("First player's name:")
    val playerOne = readLine()!!
    println("Second player's name:")
    val playerTwo = readLine()!!

    do {
        println("Set the board dimensions (Rows x Columns)")
        println("Press Enter for default (6 x 7)")
        userBoardSize = readLine().toString().trim()

        if (properBoardSize.matches(userBoardSize)) {

            if (userBoardSize == "") {
                rows = 6
                columns = 7
            } else {
                rows = userBoardSize.first().digitToInt()
                columns = userBoardSize.last().digitToInt()
            }

            if (rows < 5 || rows > 9) {
                println("Board rows should be from 5 to 9")
            } else if (columns < 5 || columns > 9) {
                println("Board columns should be from 5 to 9")
            }
        } else {
            println("Invalid input")
        }
    } while ((rows < 5 || rows > 9) || (columns < 5 || columns > 9))

    do {
        askForNumberOfGames()
        val userInput: String = readLine()!!
        if (isNumberOfGamesValid(userInput)) {
            if (userInput == "" || userInput.toInt() == 0) {
                numberOfGamesToPlay = 1
            } else if (userInput.toInt() > 0) {
                numberOfGamesToPlay = userInput.toInt()
                isMultiRoundGame = true
            } else {
                println("Something when wrong")
            }
            setCurrentGameCounter(1)
        } else {
            println("Invalid input")
        }

    } while (!isNumberOfGamesValid(userInput))

    println("$playerOne VS $playerTwo")
    println("$rows X $columns board")
    if (numberOfGamesToPlay == 1 || numberOfGamesToPlay == 0) {
        println("Single game")
    } else {
        println("Total $numberOfGamesToPlay games")
        printCurrentGame(currentGameCounter)
    }
    gameBoard = initialiseEmptyBoard(rows, columns)

    printGameBoard(gameBoard)

    var move: Int
    do {
        var gameResult: String

        move = playerMove(playerOne, columns, gameBoard)
        if (move == -1) {
            break
        }
        //Save player's move to gameBoard
        saveMoveToTheBoard(pawnPlayerOne, move, gameBoard)
        gameResult = checkWhoWon(gameBoard)
        printGameBoard(gameBoard)
        if (gameResult == "draw") {
            println("It is a draw")
            playerOneScore += POINT_FOR_DRAW
            playerTwoScore += POINT_FOR_DRAW

            if (numberOfGamesToPlay > 1) {
                printScore(playerOne, playerOneScore, playerTwo, playerTwoScore)
                numberOfGamesToPlay--
                updateCurrentGameCounter()
                printCurrentGame(currentGameCounter)
                gameBoard = initialiseEmptyBoard(rows, columns)
                printGameBoard(gameBoard)
            } else {
                break
            }
        } else if (gameResult == "resultPlayerOneWon") {
            println("Player $playerOne won")
            playerOneScore += POINT_FOR_WIN

            if (numberOfGamesToPlay > 1) {
                printScore(playerOne, playerOneScore, playerTwo, playerTwoScore)
                numberOfGamesToPlay--
                updateCurrentGameCounter()
                printCurrentGame(currentGameCounter)
                gameBoard = initialiseEmptyBoard(rows, columns)
                printGameBoard(gameBoard)
            } else {
                break
            }
        } else if (gameResult == "resultPlayerTwoWon") {
            println("Player $playerTwo won")
            playerTwoScore += POINT_FOR_WIN

            if (numberOfGamesToPlay > 1) {
                printScore(playerOne, playerOneScore, playerTwo, playerTwoScore)
                numberOfGamesToPlay--
                updateCurrentGameCounter()
                printCurrentGame(currentGameCounter)
                gameBoard = initialiseEmptyBoard(rows, columns)
                printGameBoard(gameBoard)
            } else {
                break
            }
        }

        move = playerMove(playerTwo, columns, gameBoard)
        checkWhoWon(gameBoard)
        if (move == -1) {
            break
        }
        //Save player's move to gameBoard
        saveMoveToTheBoard(pawnPlayerTwo, move, gameBoard)
        gameResult = checkWhoWon(gameBoard)
        printGameBoard(gameBoard)
        if (gameResult == "draw") {
            println("It is a draw")
            playerTwoScore += POINT_FOR_DRAW
            playerOneScore += POINT_FOR_DRAW

            if (numberOfGamesToPlay > 1) {
                printScore(playerOne, playerOneScore, playerTwo, playerTwoScore)
                numberOfGamesToPlay--
                updateCurrentGameCounter()
                printCurrentGame(currentGameCounter)
                gameBoard = initialiseEmptyBoard(rows, columns)
                printGameBoard(gameBoard)
            } else {
                break
            }
        } else if (gameResult == "resultPlayerOneWon") {
            println("Player $playerOne won")
            playerOneScore += POINT_FOR_WIN

            if (numberOfGamesToPlay > 1) {
                printScore(playerOne, playerOneScore, playerTwo, playerTwoScore)
                numberOfGamesToPlay--
                updateCurrentGameCounter()
                printCurrentGame(currentGameCounter)
                gameBoard = initialiseEmptyBoard(rows, columns)
                printGameBoard(gameBoard)
            } else {
                break
            }
        } else if (gameResult == "resultPlayerTwoWon") {
            println("Player $playerTwo won")
            playerTwoScore += POINT_FOR_WIN

            if (numberOfGamesToPlay > 1) {
                printScore(playerOne, playerOneScore, playerTwo, playerTwoScore)
                numberOfGamesToPlay--
                updateCurrentGameCounter()
                printCurrentGame(currentGameCounter)
                gameBoard = initialiseEmptyBoard(rows, columns)
                printGameBoard(gameBoard)
            } else {
                break
            }
        }

    } while (numberOfGamesToPlay > 1 || move != -1)

    if (move == -1) {
        println("Game over!")
    } else {
        printScore(playerOne, playerOneScore, playerTwo, playerTwoScore)
        println("Game over!")
    }
}


fun printCurrentGame(currentGame: Int) {
    println("Game #$currentGame")
}


fun playerMove(player: String, boardColumns: Int, gameBoard: Array<Array<String>>): Int {
    var userInput: String

    println("$player's turn:")
    do {
        userInput = readLine()!!

        if (!isNumeric(userInput) && userInput != "end") {
            println("Incorrect column number")
            println("$player's turn:")
        } else if (userInput == "end") {
            break
        } else if (userInput.toInt() < 1 || userInput.toInt() > boardColumns) {
            println("The column number is out of range (1 - $boardColumns)")
            println("$player's turn:")
        } else if (gameBoard[0][userInput.toInt() - 1] != " ") {
            println("Column $userInput is full")
            println("$player's turn:")

//            break
        }

    } while ((!isNumeric(userInput) && userInput != "end")
        || (userInput != "end" && (userInput.toInt() < 1 || userInput.toInt() > boardColumns))
        || (gameBoard[0][userInput.toInt() - 1] != " ")
    )

    if (userInput == "end") {
        return -1
    } else {
        return userInput.toInt()
    }
}

fun checkWhoWon(gameBoard: Array<Array<String>>): String {
    var result = ""
    var isBoardFull = false
    var counter = 0


    // hotizontal check
    loop@ for (row in 0..gameBoard.lastIndex) {
        for (column in 0..gameBoard.lastIndex - 3) {
            if (gameBoard[row][column] == "o"
                && gameBoard[row][column + 1] == "o"
                && gameBoard[row][column + 2] == "o"
                && gameBoard[row][column + 3] == "o"
            ) {
                return "resultPlayerOneWon"
                break@loop
            } else if (gameBoard[row][column] == "*"
                && gameBoard[row][column + 1] == "*"
                && gameBoard[row][column + 2] == "*"
                && gameBoard[row][column + 3] == "*"
            ) {
                return "resultPlayerTwoWon"
                break@loop
            }
        }
    }

    // vertical check
    loop@ for (row in 0..gameBoard.lastIndex - 3) {
        for (column in 0..gameBoard.lastIndex) {
            if (gameBoard[row][column] == "o"
                && gameBoard[row + 1][column] == "o"
                && gameBoard[row + 2][column] == "o"
                && gameBoard[row + 3][column] == "o"
            ) {
                return "resultPlayerOneWon"
                break@loop
            } else if (gameBoard[row][column] == "*"
                && gameBoard[row + 1][column] == "*"
                && gameBoard[row + 2][column] == "*"
                && gameBoard[row + 3][column] == "*"
            ) {
                return "resultPlayerTwoWon"
                break@loop
            }
        }
    }

    // diagonal "/"  check
    loop@ for (row in gameBoard.lastIndex downTo 3) {
        for (column in gameBoard.lastIndex - 3 downTo 0) {
            if (gameBoard[row][column] == "o"
                && gameBoard[row - 1][column + 1] == "o"
                && gameBoard[row - 2][column + 2] == "o"
                && gameBoard[row - 3][column + 3] == "o"
            ) {
                result = "resultPlayerOneWon"
                break@loop
            } else if (gameBoard[row][column] == "*"
                && gameBoard[row - 1][column + 1] == "*"
                && gameBoard[row - 2][column + 2] == "*"
                && gameBoard[row - 3][column + 3] == "*"
            ) {
                result = "resultPlayerTwoWon"
                break@loop
            }
        }
    }

    // diagonal "\"  check
    loop@ for (row in gameBoard.lastIndex downTo 3) {
        for (column in gameBoard.lastIndex downTo 3) {
            if (gameBoard[row][column] == "o"
                && gameBoard[row - 1][column - 1] == "o"
                && gameBoard[row - 2][column - 2] == "o"
                && gameBoard[row - 3][column - 3] == "o"
            ) {
                result = "resultPlayerOneWon"
                break@loop
            } else if (gameBoard[row][column] == "*"
                && gameBoard[row - 1][column - 1] == "*"
                && gameBoard[row - 2][column - 2] == "*"
                && gameBoard[row - 3][column - 3] == "*"
            ) {
                result = "resultPlayerTwoWon"
                break@loop
            }
        }
    }

    for (column in gameBoard[0].indices) {
        if (gameBoard[0][column] == " ") {
            counter++
        }

        if (counter > 0) {
            isBoardFull = false
            break
        }
    }

    if (result == "resultPlayerOneWon"
        || result == "resultPlayerTwoWon"
        || result == "resultIsUnknown"
        && counter != 0
    ) {
        result = result
    } else if (counter == 0) {
        isBoardFull = true
        result = "draw"
    }

    return "$result"
}

fun saveMoveToTheBoard(player: String, playerMove: Int, gameBoard: Array<Array<String>>): Array<Array<String>> {
    val column = playerMove - 1 // to ignore "0" index in array
    var isMoveValid = false
    for (i in gameBoard.lastIndex downTo 0) {
        for (j in gameBoard[i].lastIndex downTo 0) {
            if (gameBoard[i][column] == " ") {
                gameBoard[i][column] = "$player"
                isMoveValid = true
            }
        }
        if (isMoveValid) {
            break
        }
    }
    return gameBoard
}

/**
prints current board state
 **/
fun printGameBoard(gameBoard: Array<Array<String>>) {
    printBoardHeader(gameBoard[0].size)
    for (i in 0 until gameBoard.size) {
        for (j in 0 until gameBoard[i].size) {
            print("║${gameBoard[i][j]}")
        }
        if (gameBoard[i].size - 1 == gameBoard[i].lastIndex) {
            print("║")
        }
        println()
    }
    printBoardFooter(gameBoard[0].size)
}


fun initialiseEmptyBoard(rows: Int, columns: Int): Array<Array<String>> {
    val gameBoard = Array(rows) { Array(columns) { " " } }
    return gameBoard
}

fun printBoardHeader(columns: Int) {
    for (i in 1..columns) {
        print(" $i")
    }
    println()
}


fun printBoardFooter(columns: Int) {
//    println()
    print("╚═")
    print("╩═".repeat(columns - 1))
    println("╝")
}

fun isNumeric(value: String): Boolean {
    val intChars = '0'..'9'
    return value.all { it in intChars }
}

fun askForNumberOfGames() {
    println("Do you want to play single or multiple games?\n" +
            "For a single game, input 1 or press Enter\n" +
            "Input a number of games:")
}

fun isNumberOfGamesValid(userInput: String): Boolean {
    if (userInput == "") {
        return true
    } else if (userInput.toIntOrNull() == null) {
        return false
    } else return userInput.toInt() > 0
}

fun printScore(playerOneName: String, playerOneScore: Int, playerTwoName: String, playerTwoScore: Int) {
    println("Score")
    println("$playerOneName: $playerOneScore $playerTwoName: $playerTwoScore")
}

