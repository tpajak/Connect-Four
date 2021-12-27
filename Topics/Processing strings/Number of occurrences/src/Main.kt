fun main() {
    // write your code here
    val input = readLine()!!
    val subString = readLine()!!

    val split = input.split(subString).toMutableList()

    print(split.lastIndex)
}