//import java.util.ArrayList;
//import java.util.Scanner;
//
//// скобки в коде
//public class First {
//    static boolean pair(Character a, Character b){
//        return a == '(' && b == ')' || a == '{' && b == '}' || a == '[' && b == ']';
//    }
//    private static int result(char[] chArray) {
//        Stack<Character> mStack = new Stack<>(new ArrayList<>());
//        Stack<Integer> stack = new Stack<>(new ArrayList<>());
//        for (int i = 0; i < chArray.length; i++) {
//            switch (chArray[i]) {
//                case '}':
//                case ')':
//                case ']':
//                    if (!mStack.isEmpty()) {
//                        if (pair( mStack.peek(), chArray[i])) {
//                            mStack.pop();
//                            stack.pop();
//                        } else {
//                            return i + 1;
//                        }
//                    } else {
//                        return i + 1;
//                    }
//                    break;
//                case '{':
//                case '[':
//                case '(':
//                    mStack.push(chArray[i]);
//                    stack.push(i + 1);
//                    break;
//                default:
//                    break;
//            }
//        }
//
//        if (stack.isEmpty()) {
//            return 0;
//        } else {
//            return stack.peek();
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        char[] chArray = in.nextLine().toCharArray();
//
//        int result = result(chArray);
//        if (result == 0) {
//            System.out.print("Success");
//        } else {
//            System.out.println(result);
//        }
//        in.close();
//
//
//    }
//}