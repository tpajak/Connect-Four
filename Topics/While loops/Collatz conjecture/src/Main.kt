fun main() {
    // put your code here
    val number: Int = readLine()!!.toInt()
    var result: Int = 0
    var tempResult: Int = number

    print("$number ")

    while (tempResult != 1) {
        if (tempResult % 2 == 0) {
            tempResult = tempResult / 2
        } else {
            tempResult = tempResult * 3 + 1
        }

        print("$tempResult ")
    }
}