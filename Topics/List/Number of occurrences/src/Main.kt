fun solution(strings: List<String>, str: String): Int {
    // put your code here
    var counter: Int = 0
    for (string in strings) {
        if (string == str) {
            counter++
        }
    }
    return counter
}