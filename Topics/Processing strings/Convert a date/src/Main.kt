fun main() {
    // write your code here
    val date = readLine().toString()
    val array: List<String> = date.split("-")
    print("${array[1]}/${array[2]}/${array[0]}")

}