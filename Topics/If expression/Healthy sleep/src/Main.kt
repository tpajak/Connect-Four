fun main() {
    // write your code here
    val aMinHours = readLine()!!.toInt()
    val bMaxHours = readLine()!!.toInt()
    val hHoursOfSleep = readLine()!!.toInt()

    if (hHoursOfSleep < aMinHours) {
        print("Deficiency")
    } else if (hHoursOfSleep > bMaxHours) {
        print("Excess")
    } else {
        print("Normal")
    }
}