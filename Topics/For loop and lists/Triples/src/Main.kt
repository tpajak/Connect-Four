fun main() {
    // write your code here
    val listSize = readLine()!!.toInt()
    val mutableList: MutableList<Int> = mutableListOf()
    var triplesFound: Int = 0

    for (i in 0 until listSize) {
        mutableList.add(readLine()!!.toInt())
    }

    for (i in 0..listSize - 3) {
        if (mutableList[i] + 1 == mutableList[i + 1]
            && mutableList[i] + 2 == mutableList[i + 2]) {
            triplesFound++
        }
    }

    print(triplesFound)
}