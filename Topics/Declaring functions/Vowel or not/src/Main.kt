// write your function here

fun main() {
    val letter = readLine()!!.first()

    println(isVowel(letter))
}

fun isVowel(letter: Char): Boolean {
    val vovels = mutableListOf<Char>('a', 'e', 'i', 'o', 'u')
    var isVowel = false
    for (vovel in vovels) {
        if (letter.lowercaseChar() == vovel) {
            isVowel = true
        }
    }
    return isVowel
}