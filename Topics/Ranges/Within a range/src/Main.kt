fun main() {
    // write your code here
    val l1 = readLine()!!.toInt()
    val l2 = readLine()!!.toInt()
    val l3 = readLine()!!.toInt()
    val l4 = readLine()!!.toInt()
    val l5 = readLine()!!.toInt()

    print(l5 in l1..l2 || l5 in l3..l4)
}