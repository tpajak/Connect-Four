fun solution(strings: MutableList<String>, str: String): MutableList<String> {
    // put your code here
    for (index in strings.indices) {
        if (strings[index] == str) {
            strings.set(index, "Banana")
        }
    }
//    val element = strings.indexOf(str)
    return strings
}