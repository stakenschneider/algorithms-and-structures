package module_4

fun main() {
    val phoneBook = hashMapOf<Int, String>()
    val buf = StringBuilder()
    val n = readLine()!!.toInt()
    val command = mutableListOf<List<String>>()

    for (i in 0 until n) {
        command.add(readLine()!!.toString().split(" "))
        when (command[i][0]) {
            "find" -> buf.append(phoneBook[command[i][1].toInt()] ?: "not found").append("\n")

            "add" -> phoneBook[command[i][1].toInt()] = command[i][2]

            "del" -> phoneBook.remove(command[i][1].toInt())
        }
    }
    println(buf)
}
