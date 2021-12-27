fun main() {
    // write your code here
    val string = readLine()!!.toString()
    var newString: String = ""

    for (index in 0..string.lastIndex) {
//        println(string[index].toString())
        newString += string[index].toString() + string[index].toString()
    }

    print(newString)
}