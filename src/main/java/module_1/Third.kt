package module_1

//Симуляция обработки сетевых пакетов
fun main() {
    val (s, n) = readLine()!!.split(' ').take(2).map { it.toInt() }
    val buf = mutableListOf<Int>()
    var current = -1
    val result = IntArray(n) { -1 }

    repeat(n) {
        val (begin, duration) = readLine()!!.split(' ').take(2).map { it.toInt() }
        while (buf.size > 0 && buf.first() <= begin){
            buf.remove(buf.first())
        }

        if (buf.size < s) {
            current = maxOf(current, begin)
            result[it] = current.also { current += duration }
            buf.add(current)
        }
    }
    result.forEach { println(it) }
}