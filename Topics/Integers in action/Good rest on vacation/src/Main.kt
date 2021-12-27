fun main() {
    // put your code here
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()
    val d = readLine()!!.toInt()

    val totalFoodAndDays = a * b
    val twoWayTickets = c * 2
    val HotelStays = (a - 1) * d

    print((totalFoodAndDays) + twoWayTickets + HotelStays)
}