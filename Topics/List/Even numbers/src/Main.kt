fun solution(numbers: List<Int>) {
    // put your code here
    for (number in numbers) {
        if (number % 2 == 0) {
            print("$number ")
        }
    }
}

//fun main() {
//
//    val numbers = listOf<Int>(8, 11, 13, 2)
//    for (number in numbers) {
//        if (number % 2 == 0) {
//            print("$number ")
//        }
//    }
//}