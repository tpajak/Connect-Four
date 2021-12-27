fun main() {
    // put your code here
//    fun main() {
//        val listX = mutableListOf(1, 2, 3, 4, 5)
//        val listY = mutableListOf(1, 2, 3, 4, 5)
//        repeat(3) {
//            val (x, y) = readLine()!!.split(" ").map { it.toInt() }
//            listX.remove(x)
//            listY.remove(y)
//        }
//        println(listX.joinToString(" "))
//        println(listY.joinToString(" "))
//    }

    val boardX: IntArray = intArrayOf(0, 0, 0, 0, 0)
    val boardY: IntArray = intArrayOf(0, 0, 0, 0, 0)

    val resultX = mutableListOf<Int>()
    val resultY = mutableListOf<Int>()

    var inputLimit = 0
    do {
        val (x, y) = readLine()!!.split(" ")
        boardX[x.toInt() - 1] = x.toInt()
        boardY[y.toInt() - 1] = y.toInt()
        inputLimit++
    } while (inputLimit < 3)

    for (i in 0..4) {
        if (boardX[i] != 0) {
            continue
        } else {
            resultX.add(i + 1)
        }
    }

    for (i in 0..4) {
        if (boardY[i] != 0) {
            continue
        } else {
            resultY.add(i + 1)
        }
    }

    println("${resultX.joinToString(" ")}")
    println("${resultY.joinToString(" ")}")
}