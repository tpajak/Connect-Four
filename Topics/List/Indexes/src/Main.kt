fun solution(products: List<String>, product: String) {
    // put your code here
    for (p in products.indices) {
        if (products[p] == product) {
            print("$p ")
        }
    }
}