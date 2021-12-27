fun main() {
    // write your code here
    val noOfInputs = readLine()!!.toInt()
    val mutableList: MutableList<Int> = mutableListOf()
    var output: Int = 0

    for (i in 0..noOfInputs) {
        mutableList.add(readLine()!!.toInt())
    }

    val numberToSearch = mutableList.lastOrNull()

    for (i in 0..noOfInputs-1) {
        if (mutableList[i] == numberToSearch) {
            output++
        }
    }
    print(output)
}