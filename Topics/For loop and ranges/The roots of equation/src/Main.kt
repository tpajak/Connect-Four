fun main() {
    // put your code here
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()
    val d = readLine()!!.toInt()

    for (i in 0..1000) {
        if (a * i * i * i + b * i * i + c * i + d == 0) {
            println(i)
        }
    }


}