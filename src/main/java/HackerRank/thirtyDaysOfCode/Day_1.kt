package hackerRank.thirtyDaysOfCode

// Data Types
object Day_1 {
    @JvmStatic
    fun main(args: Array<String>) {
        val i = 4
        val d = 4.0
        val s = "hackerRank "

        val i_2 = scanner.nextInt()
        val d_2 = scanner.nextDouble()
        scanner.nextLine()
        val s_2 = scanner.nextLine()

        print((i + i_2).toString() + "\n" + (d + d_2) + "\n" + (s + s_2))

        scanner.close()
    }
}