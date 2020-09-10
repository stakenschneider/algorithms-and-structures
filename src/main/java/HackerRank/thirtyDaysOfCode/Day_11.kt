package hackerRank.thirtyDaysOfCode

import java.util.*

// 2D Arrays
fun hourglassSum(arr: Array<IntArray>): Int {
    var result = Int.MIN_VALUE
    val hour = Array(3) { IntArray(3) }
    hour[0][0] = 1
    hour[0][1] = 1
    hour[0][2] = 1
    hour[1][0] = 0
    hour[1][1] = 1
    hour[1][2] = 0
    hour[2][0] = 1
    hour[2][1] = 1
    hour[2][2] = 1
    for (a in 0 until arr.size - hour.size + 1) {
        for (b in 0 until arr.size - hour.size + 1) {
            var sum = 0
            for (i in a until hour.size + a) {
                for (j in b until hour.size + b) {
                    sum += arr[i][j] * hour[i - a][j - b]
                }
            }
            result = Math.max(result, sum)
        }
    }
    return result
}

val scanner = Scanner(System.`in`)

fun main(args: Array<String>) {
    val arr = Array(6) { IntArray(6) }
    for (i in 0..5) {
        val arrRowItems = scanner.nextLine().split(" ".toRegex()).toTypedArray()
        for (j in 0..5) {
            val arrItem = arrRowItems[j].toInt()
            arr[i][j] = arrItem
        }
    }
    println(hourglassSum(arr))
    scanner.close()
}