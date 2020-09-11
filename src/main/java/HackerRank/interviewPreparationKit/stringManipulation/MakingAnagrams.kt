package hackerRank.interviewPreparationKit.stringManipulation

import java.util.*
import kotlin.math.abs

fun makeAnagram(a: String, b: String): Int {
    val freq = IntArray(26)
    a.chars().forEach { c: Int -> freq[c - 97]++ }
    b.chars().forEach { c: Int -> freq[c - 97]-- }
    return Arrays.stream(freq).map { elem -> abs(elem) }.sum()
}

fun main(args: Array<String>) {
    val res = makeAnagram("fcrxzwscanmligyxyvym", "jxwtrhvujlmrpdoqbisbwhmgpmeoke")
    println(res)
}
