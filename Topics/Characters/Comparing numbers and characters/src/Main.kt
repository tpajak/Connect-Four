fun main() {
    // write your code here
    val number: Int = readLine()!!.toInt()
    val char: Char = readLine()!!.first()

    if (char.toInt() == number) {
        print(true)
    } else {
        print(false)
    }
}