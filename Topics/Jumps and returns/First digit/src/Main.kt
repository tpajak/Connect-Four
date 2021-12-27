fun main() {
    // put your code here
    val input = readLine()!!
//    val input = "abcd37lnj"

    for (letter in input) {
        if (letter in '0'..'9') {
            print(letter)
            return
        }
    }

}