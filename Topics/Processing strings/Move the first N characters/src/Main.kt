fun main() {
    // write your code here
    val input = readLine()!!.split(" ").toMutableList()
    val word = input[0]
    var offset = input[1].toInt()

    var subString = ""

    if (offset <= word.length) {
        subString = word.substring(0, offset)
        print("${word.substring(offset)}$subString")
    } else {
        print("$word")
    }

}