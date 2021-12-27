fun main() {
    // write your code here
    val input = readLine()!!.toLowerCase()

    var counter: Int = 0
    val wordLength = input.length

    for (ch in input) {
        if (ch == 'c' || ch == 'g') {
            counter++
        }
    }

    val result: Double = counter.toDouble() / wordLength * 100

    print(result)

}