package hackerRank.thirtyDaysOfCode

import java.util.*

// Arrays
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    arr.reverse()

    arr.map { print("$it ") }
}