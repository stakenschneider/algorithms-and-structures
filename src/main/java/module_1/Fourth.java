package module_1;

import java.util.ArrayList;
import java.util.Scanner;

//Стек с поддержкой максимума
public class Fourth {

    public static void main(String[] args) {
        int n;

        String[] str;

        Scanner in = new Scanner(System.in);
        n = Integer.parseInt(in.nextLine());

        str = new String[n];

        Stack<Integer> maxValue = new Stack<>(new ArrayList<>());
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            str[i] = in.nextLine();
            String[] command = str[i].split(" ", 2);

            switch (command[0]) {
                case "push":
                    int value = Integer.parseInt(command[1]);
                    if (!maxValue.isEmpty()) {
                        maxValue.push(Math.max(maxValue.peek(), value));
                    } else {
                        maxValue.push(value);
                    }
                    break;
                case "pop":
                    if (!maxValue.isEmpty()) {
                        maxValue.pop();
                    }
                    break;
                case "max":
                    builder.append(maxValue.peek());
                    builder.append('\n');
                    break;
                default:
                    break;
            }

        }
        System.out.print(builder.toString());
        in.close();
    }
}
