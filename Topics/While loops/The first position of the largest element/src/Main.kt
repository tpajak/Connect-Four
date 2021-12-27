import java.util.*

fun main() {
    // put your code here
    val sc = Scanner(System.`in`)
    var max: Int = Int.MIN_VALUE
    var input = 0
    var positionOfMax = 0
        var count = 0

    do {

        input = sc.nextInt()
        count++
        if (input > max) {
            max = input
            positionOfMax = count
        }

    } while (sc.hasNextInt())

    print("$max $positionOfMax")
}