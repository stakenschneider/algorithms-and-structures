package hackerRank.thirtyDaysOfCode;

import java.util.*;

// BST Level-Order Traversal
class Day_23 {

    static void levelOrder(Node root) {
        List<Node> nodeList = new ArrayList<>();
        nodeList.add(root);

        while (!nodeList.isEmpty()) {
            Node node = nodeList.remove(0);
            System.out.print(node.data+" ");

                if (node.left != null) {
                    nodeList.add(node.left);
                }
                if (node.right != null) {
                    nodeList.add(node.right);
                }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Node root = null;
        while (T-- > 0) {
            int data = sc.nextInt();
            root = Node.insert(root, data);
        }
        levelOrder(root);
    }
}