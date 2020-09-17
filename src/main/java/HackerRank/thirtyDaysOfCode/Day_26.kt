package hackerRank.thirtyDaysOfCode

import java.util.*

// Nested Logic
fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    var fine = 0

    val actualDate: Int = sc.nextInt()
    val actualMonth: Int = sc.nextInt()
    val actualYear: Int = sc.nextInt()

    val expectedDate: Int = sc.nextInt()
    val expectedMonth: Int = sc.nextInt()
    val expectedYear: Int = sc.nextInt()

    if (actualYear > expectedYear) {
        fine = 10000
    } else if (actualYear == expectedYear) {
        if (actualMonth > expectedMonth) {
            fine = (actualMonth - expectedMonth) * 500
        } else if (actualMonth == expectedMonth) {
            if (actualDate > expectedDate) {
                fine = (actualDate - expectedDate) * 15
            }
        }
    }
    println(fine)
}
