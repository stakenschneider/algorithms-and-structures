package hackerRank.thirtyDaysOfCode

import java.util.*
import java.util.regex.Pattern

// RegEx, Patterns, and Intro to Databases
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val N = scan.nextLine().trim().toInt()

    val names = arrayListOf<String>()

    for (NItr in 1..N) {
        val firstNameEmailID = scan.nextLine().split(" ")

        val firstName = firstNameEmailID[0]

        val emailID = firstNameEmailID[1]

        if (Pattern.compile("@gmail").matcher(emailID).find()) {
            names.add(firstName)
        }
    }

    names.sort()
    names.map { println("$it") }
}
