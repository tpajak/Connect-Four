fun main() {
    // put your code here
    var num1 = readLine()!!.toInt()
    var num2 = readLine()!!.toInt()
    var divider = readLine()!!.toInt()

    var counter = 0

    for (i in num1..num2) {
        if (i % divider == 0) {
            counter++
        }
    }
    println(counter)


}