package module_1;

import java.util.List;

class Stack<T> {
    protected List<T>  stackArray;

    Stack(List<T> stackArray) {
        this.stackArray = stackArray;
    }

    public Stack() { }

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