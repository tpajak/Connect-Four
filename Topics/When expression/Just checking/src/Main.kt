fun main() {
    // write your code here
    val input = readLine()!!.toInt()

    print(
        when (input) {
            1, 3, 4 -> "No!"
            2 -> "Yes!"
            else -> "Unknown number"
        }
    )
}