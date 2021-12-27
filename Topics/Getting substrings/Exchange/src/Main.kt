fun main() {
    // put your code here
    val l1 = readLine()!!

    val first = l1.first()
    val last = l1.last()
    val mid = l1.substring(1, l1.length - 1)

    print("$last$mid$first")
}