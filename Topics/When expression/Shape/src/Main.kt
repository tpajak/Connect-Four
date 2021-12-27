fun main(args: Array<String>) {
    // write your code here
    val input = readLine()!!.toInt()

    val result = when (input) {
        1 -> "a square"
        2 -> "a circle"
        3 -> "a triangle"
        4 -> "a rhombus"
        else -> "There is no such shape!"
    }
    println(
        if (input in 1..4)
            "You have chosen $result"
        else
            "There is no such shape!"

    )
}