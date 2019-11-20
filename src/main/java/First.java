import java.util.Scanner;

// скобки в коде
class Stack {
    private int[] stackArray;
    private int top;

    Stack(int m) {
        stackArray = new int[m];
        top = -1;
    }

    void addElement(int element) {
        stackArray[++top] = element;
    }

    void deleteElement() {
        top--;
    }

    int readTop() {
        return stackArray[top];
    }

    boolean isEmpty() {
        return top == -1;
    }
}

public class First {
    static boolean pair(int a, int b){
        return a == '(' && b == ')' || a == '{' && b == '}' || a == '[' && b == ']';
    }
    private static int result(char[] chArray) {
        Stack mStack = new Stack(chArray.length);
        Stack stack = new Stack(chArray.length);
        for (int i = 0; i < chArray.length; i++) {
            switch (chArray[i]) {
                case '}':
                case ')':
                case ']':
                    if (!mStack.isEmpty()) {
                        if (pair(mStack.readTop(), chArray[i])) {
                            mStack.deleteElement();
                            stack.deleteElement();
                        } else {
                            return i + 1;
                        }
                    } else {
                        return i + 1;
                    }
                    break;
                case '{':
                case '[':
                case '(':
                    mStack.addElement(chArray[i]);
                    stack.addElement(i + 1);
                    break;
                default:
                    break;
            }
        }

        if (stack.isEmpty()) {
            return 0;
        } else {
            return stack.readTop();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] chArray = in.nextLine().toCharArray();

        int result = result(chArray);
        if (result == 0) {
            System.out.print("Success");
        } else {
            System.out.println(result);
        }
        in.close();
    }
}