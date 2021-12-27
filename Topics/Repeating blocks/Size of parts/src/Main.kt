fun main() {
    // put your code here
    val numberOfElements = readLine()!!.toInt()

    var larger = 0
    var smaller = 0
    var perfect = 0

    repeat(numberOfElements) {
        val a = readLine()!!.toInt()
        if (a == -1) {
            smaller++
        } else if (a == 1) {
            larger++
        } else {
            perfect++
        }

    }
    print("$perfect $larger $smaller")
}