package hackerRank.thirtyDaysOfCode;

import java.util.*;

// Linked List
class SimpleNode {
    int data;
    SimpleNode next;

    SimpleNode(int d) {
        data = d;
        next = null;
    }

    public static SimpleNode insert(SimpleNode head, int data) {
        if (head == null) {
            head = new SimpleNode(data);
        } else if (head.next == null) {
            head.next = new SimpleNode(data);
        } else {
            insert(head.next, data);
        }
        return head;
    }
}

class Day_15 {
    public static void display(SimpleNode head) {
        SimpleNode start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleNode head = null;
        int N = sc.nextInt();

        while (N-- > 0) {
            int ele = sc.nextInt();
            head = SimpleNode.insert(head, ele);
        }
        display(head);
        sc.close();
    }
}