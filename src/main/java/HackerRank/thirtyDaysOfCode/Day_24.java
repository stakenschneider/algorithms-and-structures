package hackerRank.thirtyDaysOfCode;

import java.util.Scanner;

//More Linked Lists
class Day_24 {

    public static SimpleNode removeDuplicates(SimpleNode head) {
        SimpleNode node = head;
        while (node != null && node.next != null) {
            while (node.next != null && node.data == node.next.data) {
                node.next = node.next.next;
            }
            node = node.next;
        }
        return head;
    }

    public static void display(SimpleNode head) {
        SimpleNode start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        SimpleNode head = null;
        int T = sc.nextInt();
        while (T-- > 0) {
            int ele = sc.nextInt();
            head = SimpleNode.insert(head, ele);
        }
        head = removeDuplicates(head);
        display(head);

    }
}