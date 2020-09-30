package hackerRank.interviewPreparationKit.sorting

import kotlin.collections.*
import kotlin.io.*

fun maximumToys(prices: Array<Int>, k: Int): Int {
    var countOfToys = 0
    var sum = 0
    prices.sort()
    for (i in prices.indices){
        if (sum+prices[i]<=k){
        sum+=prices[i]
        countOfToys++}
    }
    return countOfToys
}

fun main(args: Array<String>) {
    val result = maximumToys(arrayOf( 1 ,12, 5, 111, 200 ,1000 ,10 ), 50)
    println(result)
}
