import java.util.*

fun main() {
    // put your code here
    var counter = 0
    val input = Scanner(System.`in`)
    while (input.hasNextInt() && input.nextInt() != 0) {
            counter++
    }
    print(counter)
}