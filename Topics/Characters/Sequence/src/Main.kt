fun main() {
    // put your code here
    val ch1: Char = readLine()!!.first()
    val ch2: Char = readLine()!!.first()
    val ch3: Char = readLine()!!.first()

    if (ch1 + 1 == ch2 && ch2 + 1 == ch3) {
        print(true)
    } else {
        print(false)
    }


}