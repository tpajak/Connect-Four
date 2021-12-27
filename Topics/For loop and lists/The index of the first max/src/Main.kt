fun main() {
    // write your code here
    val noOfElements = readLine()!!.toInt()
    val mutableList: MutableList<Int> = mutableListOf()
    var firstMaxIndex: Int = 0

    for (i in 0..noOfElements-1) {
        mutableList.add(readLine()!!.toInt())
//        if (mutableList[i] > firstMaxIndex) {
//            firstMaxIndex = mutableList[i]
//        }
    }

    for (i in noOfElements-1 downTo 0) {
        if (mutableList[i] > firstMaxIndex) {
            firstMaxIndex = mutableList[i]
        }
    }

    print(mutableList.indexOf(firstMaxIndex))

}