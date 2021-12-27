fun main() {
    //Do not touch code below
    var inputList: MutableList<MutableList<String>> = mutableListOf()
    val n = readLine()!!.toInt()
    for (i in 0 until n) {
        val strings = readLine()!!.split(' ').toMutableList()
        inputList.add(strings)
    }
    // write your code here

//    val inputList = mutableListOf(
//        mutableListOf("1", "2", "3"),
//        mutableListOf("a", "b", "c"),
//        mutableListOf("x", "y", "z")
//    )

    val newList: MutableList<MutableList<String>> = mutableListOf()
    newList.add(inputList.last())
    newList.add(inputList.first())

    print(newList)

//    println(listOf(inputList.last(), inputList.first()))
}