package hackerRank.interviewPreparationKit.sorting

import java.util.*

fun countSwaps(a: Array<Int>) {
    var count = 0;
    for (i in a.indices) {
        for (j in 0 until a.size - 1) {
            if (a[j] > a[j + 1]) {
                val k = a[j]
                a[j] = a[j + 1]
                a[j + 1] = k
                count++
            }
        }
    }

    print("Array is sorted in "+count+" swaps.  \n" +
            "First Element: "+a[0]+"  \n" +
            "Last Element: "+a[a.size]+"  ")
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val a = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()
    countSwaps(a)
}
