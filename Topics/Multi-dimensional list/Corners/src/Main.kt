fun main() {
    //Do not touch code below
    var inputList: MutableList<MutableList<String>> = mutableListOf()
    val n = readLine()!!.toInt()

//    var inputList: MutableList<MutableList<String>> = mutableListOf(
//        mutableListOf<String>("0", "0", "0"),
//        mutableListOf<String>("0", "0", "0"),
//        mutableListOf<String>("0", "0", "0")
//    )
//    val n = 9

    for (i in 0 until n) {
        val strings = readLine()!!.split(' ').toMutableList()
        inputList.add(strings)
    }
    //write your code here
    for (array in inputList) {
        for (value in array) {
            print("${value.first()} ${value.last()}")
        }
        println("${array.first()} ${array.last()}")
    }


//    print("${inputList.first()} ${inputList.last()}")

}