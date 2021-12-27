fun main() {
    val myList = MutableList(2) { MutableList(3) { "0" } } // put your code here

    for (i in 0..1) {
        for (j in 0..2) {
            myList[i][j] = "[$i][$j]"
        }
    }
    print("[${myList.joinToString()}]")
}