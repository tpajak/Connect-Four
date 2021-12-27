fun main() {
    // put your code here
    val word = readLine()!!.toString().trim()

    for (i in 'a'..'z') {
        if (word.contains(i)) {
            continue
        }
        print(i)
    }
}