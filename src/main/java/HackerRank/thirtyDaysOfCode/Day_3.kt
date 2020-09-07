package hackerRank.thirtyDaysOfCode

// Intro to Conditional Statements
fun main(args: Array<String>) {
    val N = scanner.nextInt()
    if (N % 2 != 0) {
        println("Weird")
    } else {
        when {
            N in 2..5 -> {
                println("Not Weird")
            }
            N in 6..20 -> {
                println("Weird")
            }
            N > 20 -> {
                println("Not Weird")
            }
        }
    }
    scanner.close()
}
