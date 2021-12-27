fun main() {
    // write your code here
    val set = readLine()!!
    var result = "NO"
    var sumLeft = set.substring(0, set.length / 2)
    var sumRight = set.substring(set.length / 2)

    var sumLeftResult = 0
    var sumRightResult = 0

    for (element in sumLeft) {
        sumLeftResult += element.toInt()
    }

    for (element in sumRight) {
        sumRightResult += element.toInt()
    }

    if (sumLeftResult == sumRightResult) {
        result = "YES"
    }

    print(result)


//    print("$sumLeftResult vs $sumRightResult")
//    print("$sumLeft vs $sumRight")
}