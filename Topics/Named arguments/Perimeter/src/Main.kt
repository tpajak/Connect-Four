fun perimeter(x1: Double,
              y1: Double,
              x2: Double,
              y2: Double,
              x3: Double,
              y3: Double,
              x4: Double = x1,
              y4: Double = y1): Double {
    val d1 = Math.sqrt(Math.pow(x1 - x2, 2.0) + Math.pow(y1 - y2, 2.0))
    val d2 = Math.sqrt(Math.pow(x2 - x3, 2.0) + Math.pow(y2 - y3, 2.0))
    val d3 = Math.sqrt(Math.pow(x3 - x4, 2.0) + Math.pow(y3 - y4, 2.0))
    val d4 = Math.sqrt(Math.pow(x4 - x1, 2.0) + Math.pow(y4 - y1, 2.0))

    return d1+d2+d3+d4
}