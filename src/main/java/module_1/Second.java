package module_1;

import java.util.Scanner;

// высота дерева
public class Second {
    public static void main(String[] args) {
        int n;
        int maxHeight = 0;
        int height;
        int[] parent;
        int[] heights;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        parent = new int[n];
        heights = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = in.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (heights[i] != 0) {
                continue;
            }
            height = 0;
            for (int k = i; k != -1; k = parent[k]) {
                if (heights[k] != 0) {
                    height += heights[k];
                    break;
                }
                height++;
            }
            maxHeight = Math.max(maxHeight, height);

            for (int k = i; k != -1; k = parent[k]) {
                if (heights[k] != 0) {
                    break;
                }
                heights[k] = height--;
            }
        }
//        2 способ
//        maxHeight = 1;
//        for (int index = 0; index < parent.length; index++) {
//            maxHeight = Math.max(maxHeight, heightCounter(parent, index));
//        }

        System.out.println(maxHeight);
    }
//        2 способ
//    private static int heightCounter(int[] tree, int index) {
//        int pValue = tree[index];
//        if (pValue == -1) return 1;
//        return 1 + heightCounter(tree, pValue);
//    }
    }


