import java.util.Collection;
import java.util.Collections;
import java.util.List;

//class Stack<T> {
//    public T[] stackArray;
//    private int top;
//
//    Stack(int m) {
//        this.stackArray  = (T[])new Object[m];
//        top = -1;
//    }
//
//    void push(T element) {
//        stackArray[++top] = element;
//    }
//
//    T pop() {
//        return stackArray[--top];
//    }
//
//    T peek() {
//        return stackArray[top];
//    }
//
//    boolean isEmpty() {
//        return top == -1;
//    }
//}

class Stack<T> {
    private List<T>  stackArray;

    Stack(List<T> stackArray) {
        this.stackArray = stackArray;
    }

    void push(T element) {
        stackArray.add(element);
    }

    T pop() {
        T res = stackArray.get(stackArray.size()-1);
        stackArray.remove(stackArray.size()-1);
        return res;
    }

    T peek() {
        return stackArray.get(stackArray.size()-1);
    }

    boolean isEmpty() {
        return stackArray.isEmpty();
    }
}