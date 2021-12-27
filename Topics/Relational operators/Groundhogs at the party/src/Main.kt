fun main() {
    // write your code here
    val butterCups = readLine()!!.toInt()
    val isWeekend = readLine()!!.toBoolean()

    val result = (butterCups >= 10 && butterCups <=20 && !isWeekend) || (butterCups >= 15 && butterCups <=25 && isWeekend)
        print(result)
}