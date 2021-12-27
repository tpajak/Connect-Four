fun main() {
    // put your code here
    val input = readLine()!!.toInt()
//    val input = 0
    var counter = 1
    var printedNumbers = 0
    var lessThanNumber = true

    while (lessThanNumber) {
        if (input == 0) {
            lessThanNumber = false
            break
        }
        for (i in 1..counter) {
            printedNumbers++
            print("$counter ")
            if (printedNumbers >= input) {
                lessThanNumber = false
                break
            }
        }
        counter++
    }
}