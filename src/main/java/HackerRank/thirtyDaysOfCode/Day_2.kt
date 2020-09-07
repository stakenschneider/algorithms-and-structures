package hackerRank.thirtyDaysOfCode

import kotlin.math.roundToInt

// Operators
fun solve(meal_cost: Double, tip_percent: Int, tax_percent: Int) {
    var tip = 0.0
    if (tip_percent != 0) {
        tip = meal_cost * tip_percent / 100
    }
    var tax = 0.0
    if (tax_percent != 0) {
        tax = meal_cost * tax_percent / 100
    }
    val total = meal_cost + tip + tax
    println(total.roundToInt())
}

fun main(args: Array<String>) {
    val meal_cost = scanner.nextDouble()
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?")
    val tip_percent = scanner.nextInt()
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?")
    val tax_percent = scanner.nextInt()
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?")
    solve(meal_cost, tip_percent, tax_percent)
    scanner.close()
}
