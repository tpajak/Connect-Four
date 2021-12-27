fun main() {
    // write your code here
    val word = readLine()!!.toString()

    var rightToLeftWord = ""
    for (ch in word.lastIndex downTo 0) {
        rightToLeftWord += word[ch].toString()
//        println(rightToLeftWord)
    }

    if (word == rightToLeftWord) {
        print("yes")
    } else {
        print("no")
    }
}