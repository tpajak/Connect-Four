import java.util.concurrent.TimeUnit

fun main() {
    val totalSeconds : Long = System.currentTimeMillis() / 1000L // dont change this line

    val secondsToday: Long = (totalSeconds % (3600 * 24)) //3600s = 1h
    val hoursToday = (secondsToday / 3600)

    val minuets = (secondsToday % 3600) / 60
    val seconds =  (secondsToday % 3600) % 60

    print("$hoursToday:$minuets:$seconds")
}