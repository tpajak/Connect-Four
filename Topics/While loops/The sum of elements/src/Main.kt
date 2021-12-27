import java.util.*

fun main() {
    // put your code here
    val sc = Scanner(System.`in`)
    var sum = 0
    var inputIsZero = false

    while (!inputIsZero) {
        var value = sc.nextInt()
            sum = sum + value
        if (value == 0) {
            inputIsZero = true
        }
    }

    print(sum)
}