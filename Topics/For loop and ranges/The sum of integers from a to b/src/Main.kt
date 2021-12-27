fun main() {
    // put your code here
    val l1 = readLine()!!.toInt()
    val l2 = readLine()!!.toInt()

    var sum = 0

    for (i in l1..l2) {
        sum = sum + i

    }

    print(sum)
}