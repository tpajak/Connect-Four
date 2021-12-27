fun main() {

    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()
    println(
        if (a > c) {
            if (a > b) {
                "$a"
            } else if (b > c) {
                "$b"
            } else {
                "$c"
            }
        } else {
            if (a < b) {
                "$b"
            } else if (b > c) {
                "$b"
            } else {
                "$c"
            }
        }
    )
}