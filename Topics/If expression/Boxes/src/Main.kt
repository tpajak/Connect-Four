fun main() {
    // write your code here
    val (x1, y1, z1) = readLine()!!.split(" ")
    val (x2, y2, z2) = readLine()!!.split(" ")

    if (x1 == x2 || x1 == y2 || x1 == z2) {
        print("Box 1 = Box 2")
    }

}