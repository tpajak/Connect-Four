fun main() {
    // put your code here
    val number = readLine()!!.toInt()
    var result: Int = 0
    var isSmaller = true

    while (isSmaller) {


        for (i in 1..number) {
            result = i * i
            if (result <= number && number != 1) {
                println("$result")
            } else if (number == 1) {
                println("$result")
                isSmaller = false
                break
            } else {
                isSmaller = false
                break
            }
        }
    }
}