package module_2

import java.lang.StringBuilder

var H = intArrayOf()
var countOfChanges = 0
var swaps : StringBuilder = StringBuilder()

fun parent(i: Int) = i / 2
fun leftChild(i: Int) = 2 * i + 1
fun rightChild(i: Int) = 2 * i + 2

fun siftUp(index: Int) {
    var i = index
    while (i > 1 && H[parent(i)] > H[i]) {
        val k = H[parent(i)]
        H[parent(i)] = H[i]
        H[i] = k
        countOfChanges++
        i = parent(i)
    }
}

fun siftDown(index: Int) {
    var minIndex = index
    val l = leftChild(index)
    val r = rightChild(index)

    if (l < H.size && H[l] < H[minIndex])
        minIndex = l

    if (r < H.size && H[r] < H[minIndex])
        minIndex = r

    if (index != minIndex) {
        countOfChanges++
        val k = H[minIndex]
        H[minIndex] = H[index]
        H[index] = k
        swaps.append(index)
        swaps.append(" ")
        swaps.append(minIndex)
        swaps.append("\n")
        siftDown(minIndex)
    }
}

fun main() {
    val n = readLine()!!.toInt()
    H = readLine()!!.split(" ").map { it.toInt() }.toIntArray()

    for (i in H.size / 2 - 1 downTo 0) {
        siftDown(i)
    }

    swaps.insert(0, "\n")
    swaps.insert(0, countOfChanges)
    print(swaps)
}