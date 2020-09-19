package hackerRank.thirtyDaysOfCode

// Bitwise AND
fun main(args: Array<String>) {
    val t: Int = scanner.nextInt()

    for (tItr in 0 until t) {
        val (n, k) = scanner.nextLine().split(" ").map { item -> item.toInt() }

        var max = 1 and 2
        for (i in 1..n) {
            for (j in i + 1..n) {
                if (i and j in max until k) {
                    max = i and j
                }
            }
        }
        println(max)
    }
    scanner.close()
}