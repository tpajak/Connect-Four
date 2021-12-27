fun main() {
    // put your code here
    val input: String? = readLine()!!
//    val input = 'o'

    for (i in 'a'..'z') {
        if (input!!.contains(i)) {
            return
        }
        print(i)
    }
}