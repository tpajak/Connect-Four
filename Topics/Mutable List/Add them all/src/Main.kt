fun solution(first: List<Int>, second: List<Int>): MutableList<Int> {
    // put your code here
    val firstMutable: MutableList<Int> = first.toMutableList()

    return (firstMutable + second) as MutableList<Int>
}

//fun main() {
//    print(solution(listOf(1,2,3), listOf(4, 5, 6)))
//
//}