import java.util.*

fun main() {
    // put your code here
    var max: Int = 0

    val scanner = Scanner(System.`in`)
    while (scanner.hasNext()) {
        var input = scanner.next().toInt()
        if (input > max) {
            max = input
        }
    }

    print(max)
}