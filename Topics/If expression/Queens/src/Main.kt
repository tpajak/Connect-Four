import java.lang.Math.abs

fun main() {
    // write your code here
    // println(abs(-5)) // 5

//    val scanner = Scanner(System.`in`)
//    val x1 = scanner.nextInt()

    val (x1, y1) = readLine()!!.split(' ').map(String::toInt)
    val (x2, y2) = readLine()!!.split(" ").map(String::toInt)

    var result = " "
    if (x1 == x2 || y1 == y2 || abs(x1 - x2) == abs(y1 - y2)) {
        result = "YES"
    } else {
        result = "NO"
    }

    // if abs(qR – oR) = abs(qC – oC)

    print(result)
}