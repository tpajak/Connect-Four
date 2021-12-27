fun main() {
    // write your code here

    var balance = readLine()!!.toInt()
    val purchase = readLine()!!.split(" ").toMutableList()
    var expences = 0

    while (balance - expences >= 0) {
        for (index in purchase.indices) {
            expences = purchase[index].toInt()

            if (balance - expences >= 0) {
                balance -= expences
            } else {
                println("Error, insufficient funds for the purchase. Your balance is $balance, " +
                        "but you need ${expences}.")
                return
            }
        }
    }

    if (balance >= 0) {
        println("Thank you for choosing us to manage your account! " +
                "Your balance is $balance.")
    }
}