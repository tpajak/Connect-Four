// You can experiment here, it won’t be checked

fun main(args: Array<String>) {
  // put your code here
    val numbers = readLine()!!.toInt()
    var mutableList = mutableListOf<Int>()
    var result: String = "NO"

    for (i in 0..numbers) {
        mutableList.add(readLine()!!.toInt())
    }

    val NumberToFind = mutableList[numbers-1]
    println("number to find $NumberToFind")

    for (i in 0..numbers) {
        if (mutableList[i] == NumberToFind) {
            result = "YES"
        }
    }

    print(result)
}
