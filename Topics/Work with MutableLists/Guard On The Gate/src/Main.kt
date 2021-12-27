fun main() {
    val backFromTheWall = readLine()!!.split(", ").map { it }.toMutableList()
    val returnedWatchman = readLine()!!
    // do not touch the lines above
    // write your code here

    val newList = backFromTheWall + returnedWatchman
    print(newList.joinToString())

}