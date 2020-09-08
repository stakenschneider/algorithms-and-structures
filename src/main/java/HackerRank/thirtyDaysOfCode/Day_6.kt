package hackerRank.thirtyDaysOfCode

// Let's Review
fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    var a = readLine()

    for (i in 0..n) {
        var odd = ""
        var even = ""
        for (k in a!!.indices) {
            if (k % 2 == 0) {
                odd += a[k]
            } else {
                even += a[k]
            }
        }
        print("$odd $even\n")
        a = readLine().orEmpty()
    }
}
