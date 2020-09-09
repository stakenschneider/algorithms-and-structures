package hackerRank.thirtyDaysOfCode

import java.util.*

// Dictionaries and Maps
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val n = scan.nextLine().trim().toInt()
    val map = mutableMapOf<String,String>()

    for (i in 0 until n){
        val (a,b) = scan.nextLine().split(" ")
        map[a] = b;
    }

    for (i in 0 until n){
        val name = scan.nextLine()
        if (map.containsKey(name)) {
            print(name+"="+map[name]+"\n")
        } else {
            print("Not found\n")
        }
    }
}