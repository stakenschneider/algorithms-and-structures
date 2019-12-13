package module_1;

import java.util.List;

class MaxStack<T extends Comparable<T>> extends Stack<T> implements Comparable<MaxStack<T>> {
    private T a;
    private T b;

    @Override
    public int compareTo(MaxStack<T> another) {
        return a.compareTo(another.b);
    }

    MaxStack(List<T> stackArray) {
        this.stackArray = stackArray;
    }

    @Override
    void push(T element) {
        if (!stackArray.isEmpty()) {
            if (element.compareTo(stackArray.get(stackArray.size() - 1)) > 0) {
                stackArray.add(element);
            } else {
                stackArray.add(stackArray.get(stackArray.size() - 1));
            }
        } else {
            stackArray.add(element);
        }
    }
}
