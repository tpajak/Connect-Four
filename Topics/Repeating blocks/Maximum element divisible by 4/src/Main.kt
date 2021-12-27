fun main() {
    // put your code here
    val numbersToCheck = readLine()!!.toInt()

    var biggestNumberDevidedByFour = 0
    repeat(numbersToCheck) {
        val testedNumber = readLine()!!.toInt()
        if (testedNumber % 4 == 0 && testedNumber > biggestNumberDevidedByFour) {
            biggestNumberDevidedByFour = testedNumber
        }
    }

    print(biggestNumberDevidedByFour)
}