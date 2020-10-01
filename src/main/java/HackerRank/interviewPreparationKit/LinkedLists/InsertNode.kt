package hackerRank.interviewPreparationKit.LinkedLists

import java.util.*

class SinglyLinkedListNode(nodeData: Int) {
    var data: Int = nodeData
    var next: SinglyLinkedListNode? = null
}

class SinglyLinkedList {
    var head: SinglyLinkedListNode?
    var tail: SinglyLinkedListNode?

    init {
        head = null
        tail = null
    }

    fun insertNode(nodeData: Int) {
        val node = SinglyLinkedListNode(nodeData)

        if (head == null) {
            head = node
        } else {
            tail?.next = node
        }

        tail = node
    }
}

fun printSinglyLinkedList(head: SinglyLinkedListNode?, sep: String) {
    var node = head;

    while (node != null) {
        print(node.data)
        node = node.next

        if (node != null) {
            print(sep)
        }
    }
}

fun insertNodeAtPosition(head: SinglyLinkedListNode?, data: Int, position: Int): SinglyLinkedListNode? {
    var head: SinglyLinkedListNode? = head
    val trackedHeadNode: SinglyLinkedListNode? = head
    val nodeToInsert = SinglyLinkedListNode(data)

    if (head == null) {
        return nodeToInsert
    }

    if (position == 0) {
        nodeToInsert.next = head
        return nodeToInsert
    }

    var currPosition = 0
    while (currPosition < position - 1) {
        head = head!!.next
        currPosition++
    }

    val nodeAtPosition: SinglyLinkedListNode? = head?.next
    head!!.next = nodeToInsert
    head = head!!.next
    head!!.next = nodeAtPosition

    return trackedHeadNode
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val llistCount = scan.nextLine().trim().toInt()
    val llist = SinglyLinkedList()

    for (i in 0 until llistCount) {
        val llist_item = scan.nextLine().trim().toInt()
        llist.insertNode(llist_item)
    }

    val data = scan.nextLine().trim().toInt()
    val position = scan.nextLine().trim().toInt()
    val llist_head = insertNodeAtPosition(llist.head, data, position)
    printSinglyLinkedList(llist_head, " ")
}
