fun carPrice(
    old: Int = 5,
    kilometers: Int = 100000,
    maximumSpeed: Int = 120,
    automatic: Boolean = false,
) {
    val initialCarPrice = 20000
    var price: Int

    price = initialCarPrice - (old * 2000)
    price -= (kilometers / 10000) * 200
    price += (maximumSpeed - 120) * 100
    if (automatic) price +=  1500

    println(price)
}