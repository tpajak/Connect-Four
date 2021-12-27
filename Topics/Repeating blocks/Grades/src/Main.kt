fun main() {
    // put your code here
    val numberOfStudents = readLine()!!.toInt()

    var a = 0
    var b = 0
    var c = 0
    var d = 0

    repeat(numberOfStudents) {
        var input = readLine()!!.toInt()
        if (input == 2) {
            d++
        } else if (input == 3) {
            c++
        } else if (input == 4) {
            b++
        } else if (input == 5) {
            a++
        }

    }

    print("$d $c $b $a")
}