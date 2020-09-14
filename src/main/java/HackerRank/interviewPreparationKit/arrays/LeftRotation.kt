package hackerRank.interviewPreparationKit.arrays

import hackerRank.thirtyDaysOfCode.scanner

fun rotLeft(a: Array<Int>, d: Int): Array<Int> {
    val res = Array(a.size){1}
    for (i in a.indices) {
        val newLocation: Int = (i + (a.size - d)) % a.size
        res[i] = a[newLocation]
    }
    return a;
}

fun main(args: Array<String>) {
    val nd = scanner.nextLine().split(" ")
    val d = nd[1].trim().toInt()
    val a = scanner.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    println(rotLeft(a, d).joinToString(" "))
}


