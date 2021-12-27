fun main() {
    // write your code here
    val input = readLine()!!.toString().toMutableList()

    var counter = 1
    var tempPass = ""

    for (index in input.indices) {
        if (index + 1 < input.size && input[index] == input[index + 1]) {
            counter++
        } else {
            tempPass = "${input[index]}$counter"
            counter = 1 // reset counter
            print(tempPass)
        }
    }
}