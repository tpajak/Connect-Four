fun main() {    
    val firstAnswer = readLine().toBoolean() // read other values in the same way
    val secondAnswer = readLine().toBoolean()
    val confession = readLine().toBoolean()
    // write your code here
    //println(firstAnswer) //knight
    //println(secondAnswer) //marchant
    if (confession || firstAnswer xor secondAnswer) {
        print("false") //not robbers
    } else
        print("true")
    
}
