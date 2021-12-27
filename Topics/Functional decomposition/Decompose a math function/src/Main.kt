fun f(x: Double) = when {
    // call your implemented functions here
    x <= 0 -> f1(x)
    x > 0 && x < 1 -> f2(x)
    x >= 1 -> f3(x)
    else -> {}
}

// implement your functions here
fun f1(x: Double): Double {
    return x * x + 1
}

fun f2(x: Double): Double {
    return 1 / (x * x)
}

fun f3(x: Double): Double {
    return x * x - 1
}