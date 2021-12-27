fun main() {
    // write your code here
    val l1 = readLine()!!.toInt()
    val l2 = readLine()!!.toInt()

    for (i in l1..l2) {
         if (i % 5 == 0 && i % 3 == 0) {
             println("FizzBuzz")
        } else if (i % 5 == 0) {
            println("Buzz")
        } else if (i % 3 == 0) {
             println("Fizz")
        } else {
            println(i)
        }
    }
}