fun main() {
    // write your code here

    val ticketNumber = readLine()!!.toString()

    var prefixSum: Int = 0
    var sufixSum: Int = 0

    val prefix = ticketNumber.substring(0,3)
    val sufix = ticketNumber.substring(ticketNumber.length - 3, ticketNumber.length)
//    print("$prefixSum and $sufixSum")

    for (element in prefix) {
        prefixSum += element.toString().toInt()
//        println(prefixSum)
    }

    for (element in sufix) {
        sufixSum += element.toString().toInt()
//        println(sufixSum)
    }

    if (prefixSum == sufixSum) {
        print("Lucky")
    } else {
        print("Regular")
    }
}