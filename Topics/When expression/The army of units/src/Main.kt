fun main() {
    val input = readLine()!!.toInt()
//    val input = 1000

    val result = when {
        input < 1 -> "no army"
        input in 1..4 -> "few"
        input in 5..9 -> "several"
        input in 10..19 -> "pack"
        input in 20..49 -> "lots"
        input in 50..99 -> "horde"
        input in 100..249 -> "throng"
        input in 250..499 -> "swarm"
        input in 500..999 -> "zounds"
        input >= 1000 -> "legion"
        else -> "error"
    }

    print(result)
}
