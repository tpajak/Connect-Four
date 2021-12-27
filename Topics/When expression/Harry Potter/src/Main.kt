fun main() {
    // write your code here
    val input = readLine()!!.toString()

    val result = when  {
        input == "gryffindor" -> "bravery"
        input == "hufflepuff" -> "loyalty"
        input == "slytherin" -> "cunning"
        input == "ravenclaw" -> "intellect"
        else -> "not a valid house"
    }

    print(result)
}