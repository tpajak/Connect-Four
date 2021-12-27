fun solution(numbers: List<Int>): Int {
    // put your code here
    var counter = 0
    for (index in numbers) {
        counter = counter + index
    }
//    print(counter)
    return counter
}