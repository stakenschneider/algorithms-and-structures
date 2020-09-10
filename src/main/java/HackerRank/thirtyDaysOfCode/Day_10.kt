package hackerRank.thirtyDaysOfCode

import java.util.*

// Binary Numbers
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    var n = scan.nextLine().trim().toInt()

    var count = 0;
    var max = Integer.MIN_VALUE

    while (n > 0) {
        if (n % 2 != 0) {
            count++
        } else {
            max = max.coerceAtLeast(count)
            count = 0
        }
        n /= 2
    }

    max = max.coerceAtLeast(count)
    print(max)
}