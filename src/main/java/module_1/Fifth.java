package module_1;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.MIN_VALUE;
import static java.lang.Integer.max;

// Максимум в скользящем окне
public class Fifth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] intArray = new int[n];
        for (int i = 0; i < n; i++) {
            intArray[i] = in.nextInt();
        }
        int k = in.nextInt();
        in.close();

        Stack<Integer> stack = new Stack<>(new ArrayList<>());
        MaxStack<Integer> maxStack = new MaxStack<Integer>(new ArrayList<>());
        StringBuilder builder = new StringBuilder();
        int currentMax = MIN_VALUE;

        if (k == 1) {
            for (int value : intArray) {
                builder.append(value).append(" ");
            }
            System.out.print(builder);
            return;
        }

        for (int i = k - 1; i >= 0; i--) {
            maxStack.push(intArray[i]);
        }

        builder.append(maxStack.pop()).append(" ");

        for (int i = k; i < n; i++) {
            currentMax = max(currentMax, intArray[i]);

            if (maxStack.isEmpty()) {
                while (!stack.isEmpty()) {
                    maxStack.push(stack.pop());
                }
                currentMax = MIN_VALUE;
                i--;
            } else {
                stack.push(intArray[i]);
                builder.append(max(max(intArray[i], maxStack.peek()), currentMax)).append(" ");
                try {
                    maxStack.pop();
                } catch (IndexOutOfBoundsException ignored) {
                }
            }
        }
        System.out.print(builder.toString());
    }
}
