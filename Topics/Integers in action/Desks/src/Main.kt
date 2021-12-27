fun main() {
    // put your code here
    val input1: Int = readLine()!!.toInt()
    val input2: Int = readLine()!!.toInt()
    val input3: Int = readLine()!!.toInt()

    print(    ((input1 / 2) + (input1 % 2))
            + ((input2 / 2) + (input2 % 2))
            + ((input3 / 2) + (input3 % 2))
    )
    // 3, 5, 1
    //1+1
    //2+1
}