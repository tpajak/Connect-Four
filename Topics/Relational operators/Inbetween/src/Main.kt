fun main() {
    // put your code here
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()

    print((b <= a && a <= c) || b >= a && a >= c)

}