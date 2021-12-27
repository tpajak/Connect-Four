// You can experiment here, it won’t be checked

fun main() {
    val totalSeconds = System.currentTimeMillis() / 1000 // dont change this line

    val hours = (totalSeconds / 3600)// + 2 //3600s = 1h

    val minuets = (totalSeconds % 3600) / 60
    val seconds =  (totalSeconds % 3600) % 60

    print("$hours:$minuets:$seconds")
}
