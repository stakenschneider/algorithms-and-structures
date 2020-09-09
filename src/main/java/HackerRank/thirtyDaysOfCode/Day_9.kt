package hackerRank.thirtyDaysOfCode

import java.util.*

// Recursion 3
fun factorial(n: Int): Double = if (n < 2) 1.0 else n * factorial(n - 1)


fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val result = factorial(n)

    println(result.toInt())
}