package hackerRank.interviewPreparationKit.miscellaneous

import kotlin.io.*

fun flippingBits(n: Long): Long = n xor 4294967295

fun main(args: Array<String>) {
    println(flippingBits(0))
}
