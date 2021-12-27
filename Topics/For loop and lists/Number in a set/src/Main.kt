fun main() {
    // write your code here
    val numbers = readLine()!!.toInt()
    var mutableList = mutableListOf<Int>()
    var result: String = "NO"

    for (i in 0..numbers) {
        mutableList.add(readLine()!!.toInt())
    }

    val numberToFind = mutableList[numbers]

    for (i in 0..numbers - 1) {
        if (mutableList[i] == numberToFind) {
            result = "YES"
        }
    }
        print(result)
}
