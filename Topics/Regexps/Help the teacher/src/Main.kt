fun main() {
    val report = readLine()!!
    //write your code here.

    val regex = Regex("[0-9] wrong answer.?")

    print(report.matches(regex))

}