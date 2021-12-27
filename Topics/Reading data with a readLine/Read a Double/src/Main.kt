fun main() {
    // put your code here
    val b0: Byte = 2
    val s0: Short = 10
    val n0: Int = 5
    val l0: Long = 14
    val f0: Float = 11.4f

    val b: Byte = 5                 //1
    val s: Short = 2 + b0           //2
    val n: Int = s0.toByte() + 2    //3
    val l: Long = n0 + 4            //4
    val f: Float = l0.toFloat() + 1 //5
    val d: Double = f0 / 1          //6
}