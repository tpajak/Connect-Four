fun main() {
    // write your code here
    val input = readLine()!!.split(" ").map { it }.toMutableList()

    var longestWord = ""

    for (word in input) {
        if (word.length > longestWord.length) {
            longestWord = word
        }
    }

    print(longestWord)
}