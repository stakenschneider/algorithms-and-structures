package hackerRank.interviewPreparationKit.stringManipulation

import kotlin.io.*
import kotlin.text.*

fun alternatingCharacters(s: String): Int {
    var symbol = s[0]
    var result = -1
    for (char in s){
        if (symbol == char){
            result++
        }
        symbol = char
    }
    return result
}

fun main(args: Array<String>) {
    println(alternatingCharacters("AAAA"))
    println(alternatingCharacters("BBBBB"))
    println(alternatingCharacters("ABABABAB"))
    println(alternatingCharacters("BABABA"))
    println(alternatingCharacters("AAABBB"))
}
