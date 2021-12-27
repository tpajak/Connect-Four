fun main() {
    // write your code here
    val char: Char = readLine()!!.first()

    if (char.isUpperCase() || char.isDigit() && char != '\u0030') {
        print(true)
    } else {
        print(false)
    }
}