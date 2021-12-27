import java.util.*

fun main() {
    // put your code here
    val word = readLine()!!
//    val input = "abracadabra"

//    val scanner = Scanner(System.`in`)
//    val word = scanner.next()
    var unique = 0
    dup@ for (i in word.indices) {
        for (j in word.indices) {
            if (i == j) {
                continue
            }
            if (word[i] == word[j]) {
                continue@dup
            }
        }
        unique++
    }
    println(unique)
}