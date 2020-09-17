package hackerRank.interviewPreparationKit.dictionariesAndHashmaps

import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

fun checkMagazine(magazine: Array<String>, note: Array<String>): Unit {
    val hashMap = hashMapOf<String, Int>()

    for (i in magazine.indices) {
        var q = hashMap[magazine[i]] ?: 0
        hashMap[magazine[i]] = ++q
    }

    for (i in note.indices) {
        var q = hashMap[note[i]] ?: return print("No")
        if (--q < 0) {
            return print("No")
        }
        hashMap[note[i]] = q
    }
    print("Yes")
}

fun main(args: Array<String>) {
    val magazine = "give me one grand today night".split(" ").toTypedArray()
    val note = "give one grand today".split(" ").toTypedArray()

    checkMagazine(magazine, note)
}
