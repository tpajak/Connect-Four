fun main() {
    // put your code here
    val input = readLine()!!.toInt()
    var countPositiveNumbers = 0

    repeat(input) {
        val testedNumber = readLine()!!.toInt()
        if (testedNumber > 0) {
            countPositiveNumbers++
        }
    }

    print("$countPositiveNumbers")
}